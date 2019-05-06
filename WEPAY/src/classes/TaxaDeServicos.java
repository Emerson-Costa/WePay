
package classes;

public class TaxaDeServicos {
    private int idEmpregado;
    private String nomeEmpregado;
    private boolean planoDeSaude;
    private boolean auxilioCreche;

    public TaxaDeServicos(int idEmpregado, String nomeEmpregado, boolean planoDeSaude, boolean auxilioCreche) {
        this.idEmpregado = idEmpregado;
        this.nomeEmpregado = nomeEmpregado;
        this.planoDeSaude = planoDeSaude;
        this.auxilioCreche = auxilioCreche;
    }
    
    public float taxaPlanoSaude(float salario){
       return (1.5f / 100) * salario; //aqui desconta 1,5%
    }
    
    public float taxaAuxilioCreche(float salario){
        return (10 / 100) * salario; //aqui desconta 10%
    }

    public boolean isAuxilioCreche() {
        return auxilioCreche;
    }

    public void setAuxilioCreche(boolean auxilioCreche) {
        this.auxilioCreche = auxilioCreche;
    }

    public int getIdEmpregado() {
        return idEmpregado;
    }

    public void setIdEmpregado(int idEmpregado) {
        this.idEmpregado = idEmpregado;
    }

    public String getNomeEmpregado() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }

    public boolean isPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(boolean planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }
    
}
