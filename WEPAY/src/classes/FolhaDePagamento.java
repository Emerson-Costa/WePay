
package classes;

public class FolhaDePagamento {
    
    Data data;
    float salarioBruto;
    float contribuicaoSindical;
    int codFuncionario;
    
    FolhaDePagamento(int dia, int mes, int ano, Sistema sistema){
        
        data = new Data(dia, mes, ano);
        for(int i = 0 ; i < sistema.getPonto().size() ; i++){
           if(sistema.getPonto().get(i).getEmpregado().getId() == codFuncionario){
               
           }
        }
        
    }
    
    public float Impostos(){
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
        return imposto;
    }
    
    public float desconto(){
       return salarioBruto * Impostos();
    }
    
    public float calcularValorSalario(float salario){
       
       return salarioBruto - desconto();
    }
}
