
package classes;

public class FolhaDePagamento {
    
    private Data data;
    private int codEmpregado;
    private String nomeDoEmpregado;
    private float salarioBruto;
    private float salarioDesconto;
    private float remuneracaoVariavel;
    private float inss;
    private float planoDeSaude;
    private float auxilioCreche;
    
    FolhaDePagamento(int dia, int mes, int ano,int codEmpregado, String nomeDoEmpregado, float salarioBruto, TaxaDeServicos taxaDeServicos){
        this.data = new Data(dia, mes, ano);
        this.nomeDoEmpregado = nomeDoEmpregado;
        this.salarioBruto = salarioBruto;
        this.salarioDesconto = calcularValorSalario(taxaDeServicos);
    }
    
    public float impostos(){
        
        //INSS
        float imposto=0;
        if(salarioBruto >= 1.693){
           imposto = 8/100;
        }
        
        if(salarioBruto >= 1693 && salarioBruto < 2822 ){
           imposto = 9/100;
        }
        
        if(salarioBruto > 2822){
           imposto = 11/100; 
        }
        inss = imposto;
        
        return imposto;
    }
    
    public float descontoImpostos( ){
       
       return salarioBruto * impostos();
    }
    
    public float calcularValorSalario(TaxaDeServicos taxaDeServicos){
      /* if(taxaDeServicos.isAuxilioCreche()){
         planoDeSaude = taxaDeServicos.taxaPlanoSaude(salarioBruto);
       }
       
       if(taxaDeServicos.isPlanoDeSaude()){
         auxilioCreche = taxaDeServicos.taxaAuxilioCreche(salarioBruto);
       }*/
       return salarioBruto - descontoImpostos() /*- planoDeSaude - auxilioCreche*/;
    }

    @Override
    public String toString() {
        return "data do pagamento: "+data.toString()+"\nnome do empregado: "+nomeDoEmpregado+
                 "\nsalario bruto: "+salarioBruto+"\nsalario com desconto: "+salarioDesconto+
                 "\ndesconto inss: "+inss+"\ndesconto plano de saude: "+planoDeSaude+
                 "\ndesconto auxilio creche: "+auxilioCreche;
    }

    ////////////////////////////Encapsulamento//////////////////////////////////
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

                     
    public String getNomeDoEmpregado() {
        return nomeDoEmpregado;
    }

    public void setNomeDoEmpregado(String nomeDoEmpregado) {
        this.nomeDoEmpregado = nomeDoEmpregado;
    }

    public float getSalarioDesconto() {
        return salarioDesconto;
    }

    public void setSalarioDesconto(float salarioDesconto) {
        this.salarioDesconto = salarioDesconto;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public int getCodEmpregado() {
        return codEmpregado;
    }

    public void setCodEmpregado(int codEmpregado) {
        this.codEmpregado = codEmpregado;
    }

    public float getRemuneracaoVariavel() {
        return remuneracaoVariavel;
    }

    public void setRemuneracaoVariavel(float remuneracaoVariavel) {
        this.remuneracaoVariavel = remuneracaoVariavel;
    }

    public float getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(float planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public float getCreche() {
        return auxilioCreche;
    }

    public void setCreche(float creche) {
        this.auxilioCreche = creche;
    }
}