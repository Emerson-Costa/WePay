
package classes;

import java.io.IOException;


public class Main {

   
    public static void main(String[] args) throws IOException {
        ArquivosSistema s = new ArquivosSistema();
        s.escreverArquivo("teste.txt", "Emerson");
        s.escreverArquivo("teste.txt", "Karina");
        s.apagarArquivo("teste.txt");
     
       //System.out.println("1: Selecione o o arquivo WepayProject.java.\n2: Pressione Shift + f6 para testar o programa.\n\n\n\n");
       
        
       /**************************************Teste da classe Sistema e os teus métodos*********************************************/
       
       /*Sistema s = new Sistema();
        
       s.cadastrarEmpregado("Emerson J Silva Costa","Avenida Nacle Miguel Habib" ,"Comissionado");
       s.cadastrarEmpregado("José Canseco","Rua Antune Dias" ,"Concursado");
       s.cadastrarEmpregado("Valeska Popozuda","Avenida Abraao Dias" ,"Assaliado");
       s.lancarPontoCartao(0,"12","00", "18","00");
       s.lancarPontoCartao(1,"14","00", "19","00");
       s.lancarPontoCartao(2,"13","00", "21","00");
       s.lancarTaxaDeServicos(0, true, true);
       s.lancarTaxaDeServicos(1, false, true);
       s.lancarTaxaDeServicos(2, true, false);
       s.emitirFolhaDePagamento(0,11,02,2019,1000);
       s.emitirFolhaDePagamento(1,11,02,2019,2000);
       s.emitirFolhaDePagamento(2,11,02,2019,5000);
       s.lancarResultadoVendas(0,"Escova de Dentes",3.75f);
       s.lancarResultadoVendas(1,"Pasta de Dentes",4.75f);
       s.lancarResultadoVendas(2,"Enxaguante Bucal",11.75f);
       
       System.out.println(s.getEmpregado());
       System.out.println(s.getPonto());
       System.out.println(s.getTaxaDeServicos());
       System.out.println(s.getFolhaDePagamentos());
       System.out.println(s.getVendas());*/
       
        
       /****************************************************************************************************************************/
       
       /************************************************Teste de classes do Projeto*************************************************/
       /*Empregado e        = new Empregado("Emerson Jose da Silva Costa","Rua Nacle Miguel Habib","Assalariado");
       CartaoPonto p      = new CartaoPonto(e,"12","30","18","10");
       TaxaDeServicos t   = new TaxaDeServicos(0,e.getNome(), true,true);
       FolhaDePagamento f = new FolhaDePagamento(11,11,2011,0,"Emerson J Silva Costa", 2000,t);
       Vendas v           = new Vendas(0,"Emerson J Silva Costa","Escova de dentes",3.50f);
       
       System.out.println(e.toString());
       System.out.println(p.toString());
       System.out.println(t.toString());
       System.out.println(f.toString());
       System.out.println(v.toString());*/
       /****************************************************************************************************************************/
        
    }
    
}
