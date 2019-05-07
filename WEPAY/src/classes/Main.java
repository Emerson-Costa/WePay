
package classes;


public class Main {

   
    public static void main(String[] args) {
        
     
       //System.out.println("1: Selecione o o arquivo WepayProject.java.\n2: Pressione Shift + f6 para testar o programa.\n\n\n\n");
       
        
       /**************************************Teste da classe Sistema e os teus métodos*********************************************/
       
       /*Sistema s = new Sistema();
        
       s.cadastrarFuncionario("Emerson J Silva Costa","Avenida Nacle Miguel Habib" ,"Comissionado");
       s.cadastrarFuncionario("José Canseco","Rua Antune Dias" ,"Concursado");
       s.cadastrarFuncionario("Valeska Popozuda","Avenida Abraao Dias" ,"Assaliado");
        
       System.out.println(s.imprimirFuncionarios());*/
        
       /****************************************************************************************************************************/
       
       /************************************************Teste de classes do Projeto*************************************************/
       Empregado e        = new Empregado("Emerson Jose da Silva Costa","Rua Nacle Miguel Habib","Assalariado");
       CartaoPonto p      = new CartaoPonto(e,"12","00","15","00");
       TaxaDeServicos t   = new TaxaDeServicos(0,e.getNome(), true,true);
       FolhaDePagamento f = new FolhaDePagamento(11,11,2011,0,"Emerson J Silva Costa", 2000,t);
       Vendas v           = new Vendas(0,"Emerson J Silva Costa","Escova de dentes",3.50f);
       
       System.out.println(e.toString());
       System.out.println(p.toString());
       System.out.println(t.toString());
       System.out.println(f.toString());
       System.out.println(v.toString());
       /****************************************************************************************************************************/
        
    }
    
}
