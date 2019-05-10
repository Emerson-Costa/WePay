
package classes;

import java.util.ArrayList;


public class Sistema {
    
    private ArrayList<Empregado> empregados;
    private ArrayList<FolhaDePagamento>folhaDePagamentos;
    private ArrayList<Vendas>vendas;
    private ArrayList<CartaoPonto> ponto;
    private ArrayList<TaxaDeServicos> taxaDeServicos;
    private int idEmpregados;
   
    public Sistema(){
        
      empregados         =  new ArrayList<Empregado>();
      folhaDePagamentos =  new ArrayList<FolhaDePagamento>();
      vendas            =  new ArrayList<Vendas>();
      ponto             =  new ArrayList<CartaoPonto>();
      taxaDeServicos    =  new ArrayList<TaxaDeServicos>();
    }
    
    public boolean cadastrarEmpregado(String nome, String endereco, String tipo){
         Empregado e = new Empregado(nome, endereco, tipo);
         e.setId(idEmpregados);
         idEmpregados++;
         empregados.add(e);
         return true;    
    }
    
    public boolean alterarCadastroEmpregado(int indice,String nome, String endereco, String tipo){
        empregados.get(indice).setNome(nome);
        empregados.get(indice).setEndereco(endereco);
        empregados.get(indice).setTipo(tipo);
        return true;
    }
    
    public boolean removerEmpregado(int id){
        for(int i = 0 ; i < empregados.size() ; i++){
            if(empregados.get(i).getId() == id){
                empregados.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean lancarPontoCartao(int id, String horaChegada, String minChegada, String horaSaida, String minSaida){
        
        for(int i = 0; i < empregados.size() ; i++){
           if(empregados.get(i).getId() == id){
             CartaoPonto p = new CartaoPonto(empregados.get(id), horaChegada, minChegada, horaSaida, minSaida);
             ponto.add(p);
             return true;
           } 
        }
        return false;  
    }
    
    public boolean emitirFolhaDePagamento(int codEmpregado, int dia, int mes, int ano, float salarioBruto){
        
        for(int i = 0 ; i < empregados.size() ; i++){
           if(empregados.get(i).getId() == codEmpregado){
              FolhaDePagamento f = new FolhaDePagamento(dia, mes, ano,codEmpregado, empregados.get(i).getNome(),
                                                        salarioBruto,taxaDeServicos.get(i));
              folhaDePagamentos.add(f);
              return true;
           }
        }      
        return false;
    }
    
    public boolean lancarResultadoVendas(int codEmpregado, String produtoVendido, float valorProduto,int dia, int mes, int ano){
        for(int i = 0; i < empregados.size() ; i++){
            if(empregados.get(i).getId() == codEmpregado){
                Vendas venda = new Vendas(codEmpregado, empregados.get(i).getNome(), produtoVendido, valorProduto, dia,mes,ano);
                vendas.add(venda);
                return true;
            }
        }
        return false;
    }
    
    public boolean lancarTaxaDeServicos(int idEmpregado, boolean planoDeSaude, boolean auxilioCreche){
      for(int i = 0; i < empregados.size() ; i++){
            if(empregados.get(i).getId() == idEmpregado){
                TaxaDeServicos servicos = new TaxaDeServicos(idEmpregado,empregados.get(i).getNome(), planoDeSaude, auxilioCreche);
                taxaDeServicos.add(servicos);
                return true;
            }
        }
        return false;
    }
    
    public int buscarEmpregado(int codEmpregado){
       for(int i=0; i < empregados.size() ; i++){
           if(empregados.get(i).getId() == codEmpregado){
              return i;
           }
       } 
       return -1;
    }
    
    public String imprimirEmpregado() {
        
        String s = "";
        for(int i = 0 ; i < empregados.size() ; i++){
            s += empregados.get(i).toString();
        }
        return s;
    }
    
    public String imprimirFolhaPonto() {
        
        String s = "";
        for(int i = 0 ; i < ponto.size() ; i++){
            s += ponto.get(i).toString();
        }
        return s;
    }
    
    /******************************************************encapsulamentos******************************************************************/
    
    public ArrayList<Empregado> getEmpregado() {
        return empregados;
    }

    public void setEmpregado(ArrayList<Empregado> empregado) {
        this.empregados = empregado;
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

    public ArrayList<FolhaDePagamento> getFolhaDePagamentos() {
        return folhaDePagamentos;
    }

    public void setFolhaDePagamentos(ArrayList<FolhaDePagamento> folhaDePagamentos) {
        this.folhaDePagamentos = folhaDePagamentos;
    }

    public ArrayList<Vendas> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Vendas> vendas) {
        this.vendas = vendas;
    }

    public ArrayList<TaxaDeServicos> getTaxaDeServicos() {
        return taxaDeServicos;
    }

    public void setTaxaDeServicos(ArrayList<TaxaDeServicos> taxaDeServicos) {
        this.taxaDeServicos = taxaDeServicos;
    }

    public int getIdEmpregados() {
        return idEmpregados;
    }

    public void setIdEmpregados(int idEmpregados) {
        this.idEmpregados = idEmpregados;
    }
    
}
