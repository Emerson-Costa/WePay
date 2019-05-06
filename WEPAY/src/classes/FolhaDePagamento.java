
package classes;

public class FolhaDePagamento {
    
    private Data data;
    private int codEmpregado;
    private String nomeDoEmpregado;
    private float salarioBruto;
    private float salarioDesconto;
    private float remuneracaoVariavel;
    private float inss;
    
    FolhaDePagamento(int dia, int mes, int ano,int codEmpregado, String nomeDoEmpregado, float salarioBruto){
        this.data = new Data(dia, mes, ano);
        this.nomeDoEmpregado = nomeDoEmpregado;
        this.salarioBruto = salarioBruto;
        this.salarioDesconto = calcularValorSalario();
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
    
    public float desconto( ){
       return salarioBruto * impostos();
    }
    
    public float calcularValorSalario( ){
        
       return salarioBruto - desconto();
    }

    @Override
    public String toString() {
        return "data do pagamento: "+data.toString()+"\nnome do empregado: "+nomeDoEmpregado+
                 "\nsalario bruto: "+salarioBruto+"\nsalario com desconto: "+salarioDesconto+
                 "\ndesconto inss: "+inss+"\n";
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
}