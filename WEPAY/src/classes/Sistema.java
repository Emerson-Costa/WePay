
package classes;

import java.util.ArrayList;


public class Sistema {
    
    private ArrayList<Empregado> empregado;
    private ArrayList<FolhaDePagamento>folhaDePagamentos;
    private ArrayList<Vendas>vendas;
    private ArrayList<CartaoPonto> ponto;
    private ArrayList<TaxaDeServicos> taxaDeServicos;
    private int idEmpregados;
   
    public Sistema(){
      empregado         =  new ArrayList<Empregado>();
      folhaDePagamentos =  new ArrayList<FolhaDePagamento>();
      vendas            =  new ArrayList<Vendas>();
      ponto             =  new ArrayList<CartaoPonto>();
      taxaDeServicos    =  new ArrayList<TaxaDeServicos>();
    }
    
    public boolean cadastrarFuncionario(String nome, String endereco, String tipo){
         Empregado e = new Empregado(nome, endereco, tipo);
         e.setId(idEmpregados);
         idEmpregados++;
         empregado.add(e);
         return true;    
    }
    
    public boolean removerFuncionario(int id){
        for(int i = 0 ; i < empregado.size() ; i++){
            if(empregado.get(i).getId() == id){
                empregado.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void lancarPontoCartao(int id){
        
    }
    
     public String emitirFolhaDePagamento(int codEmpregado, int dia, int mes, int ano, float salarioBruto){
        
        for(int i = 0 ; i < empregado.size() ; i++){
           if(empregado.get(i).getId() == codEmpregado){
              FolhaDePagamento f = new FolhaDePagamento(dia, mes, ano,codEmpregado, empregado.get(i).getNome(),
                                                        salarioBruto,taxaDeServicos.get(i));
              folhaDePagamentos.add(f);
              return folhaDePagamentos.toString();
           }
        }      
        return "Funcionário não encontrado!";
    }
    
    public void lancarResultadoVendas(int codEmpregado,String nomeEmpregado, String produtoVendido, float valorProduto){
        Vendas venda = new Vendas(codEmpregado, nomeEmpregado, produtoVendido, valorProduto);
        vendas.add(venda);
    }
    
    public void lancarTaxaDeServicos(int idEmpregado, String nomeEmpregado, boolean planoDeSaude, boolean auxilioCreche){
      TaxaDeServicos servicos = new TaxaDeServicos(idEmpregado, nomeEmpregado, planoDeSaude, auxilioCreche);
      taxaDeServicos.add(servicos);
    }
    
    public ArrayList<Empregado> getEmpregado() {
        return empregado;
    }

    public void setEmpregado(ArrayList<Empregado> empregado) {
        this.empregado = empregado;
    }

    public ArrayList<CartaoPonto> getPonto() {
        return ponto;
    }

    public void setPonto(ArrayList<CartaoPonto> ponto) {
        this.ponto = ponto;
    }

    public int getQutdEmpregado() {
        return idEmpregados;
    }

    public void setQutdEmpregado(int qutdEmpregado) {
        this.idEmpregados = qutdEmpregado;
    }

   
    public String imprimirFuncionarios() {
        
        String s = "";
        for(int i = 0 ; i < empregado.size() ; i++){
            s += empregado.get(i).toString();
        }
        return s;
    }
    
    public String imprimirFolhaPonto() {
        
        String s = "";
        for(int i = 0 ; i < ponto.size() ; i++){
            s += ponto.get(i).Informacoes();
        }
        return s;
    }
    
}
