
package classes;

public class FolhaDePagamento {
    
    private Data data;
    private int codEmpregado;
    private String nomeDoEmpregado;
    private float salarioBruto;
    private float salarioDesconto;
    private float remuneracaoVariavel;
    private String inss;
    private float planoDeSaude;
    private float auxilioCreche;
    
    FolhaDePagamento(int dia, int mes, int ano,int codEmpregado, String nomeDoEmpregado, float salarioBruto, TaxaDeServicos taxaDeServicos){
        this.data = new Data(dia, mes, ano);
        this.nomeDoEmpregado = nomeDoEmpregado;
        this.salarioBruto = salarioBruto;
        this.salarioDesconto = calcularValorSalario(taxaDeServicos);
        this.codEmpregado = codEmpregado;
    }
    
    public float impostos(){
        
        //INSS
        float imposto=0;
        if(salarioBruto <= 1693){
           imposto = 8f/100;
        }
        
        if(salarioBruto > 1693 && salarioBruto <= 2822 ){
           imposto = 9f/100;
        }
        
        if(salarioBruto > 2822){
           imposto = 11f/100; 
        }
        
        inss = imposto * 100+"%";
        
        return imposto;
    }
    
    public float descontoImpostos( ){
       
       return salarioBruto * impostos();
    }
    
    public float calcularValorSalario(TaxaDeServicos taxaDeServicos){
        
       if(taxaDeServicos.isPlanoDeSaude()){
         planoDeSaude = taxaDeServicos.taxaPlanoSaude(salarioBruto);
       }
       
       if(taxaDeServicos.isAuxilioCreche()){
         auxilioCreche = taxaDeServicos.taxaAuxilioCreche(salarioBruto);
       }
       
       return salarioBruto - descontoImpostos() - planoDeSaude - auxilioCreche;
    }

    @Override
    public String toString() {
        return "data do pagamento: "+data.toString()+"\nnome do empregado: "+nomeDoEmpregado+
                 "\nsalario bruto: "+salarioBruto+"\nsalario com desconto: "+salarioDesconto+
                 "\ndesconto inss: "+inss+"\ndesconto plano de saude: "+planoDeSaude+
                 "\ndesconto auxilio creche: "+auxilioCreche+"\n\n";
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