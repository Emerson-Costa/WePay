
package classes;


public class Main {

   
    public static void main(String[] args) {
        
     
        //System.out.println("1: Selecione o o arquivo WepayProject.java.\n2: Pressione Shift + f6 para testar o programa.\n\n\n\n");
        
        Sistema s = new Sistema();
        
        s.cadastrarFuncionario("Emerson J Silva Costa","Avenida Nacle Miguel Habib" ,"Comissionado");
        s.cadastrarFuncionario("José Canseco","Rua Antune Dias" ,"Concursado");
        s.cadastrarFuncionario("Valeska Popozuda","Avenida Abraao Dias" ,"Assaliado");
        
        //System.out.println(s.imprimirFuncionarios());
       
        System.out.println(s.emitirFolhaDePagamento(0, 11, 02, 2018, 1000));
    }
    
}
