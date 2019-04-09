
package classes;

import java.util.ArrayList;


public class Sistema {
    
    private ArrayList<Empregado> empregado =  new ArrayList<Empregado>()  ;
    private ArrayList<CartaoPonto> ponto   =  new ArrayList<CartaoPonto>();
    private int qutdEmpregado;
   
    public int gerarID(){
        return qutdEmpregado;
    }
    
    public boolean cadastrarFuncionario(String nome, String endereco, String tipo){
         Empregado e = new Empregado(nome, endereco, tipo);
         e.setId(gerarID());
         empregado.add(e);
         qutdEmpregado++;
         
         return true;    
    }
    
    public boolean removerFuncionario(int id){
        for(int i = 0 ; i < qutdEmpregado ; i++){
            if(empregado.get(i).getId() == id){
                empregado.remove(i);
                qutdEmpregado--;
                return true;
            }
        }
        return false;
    }
    
    public void lancarPontoCartao(int id){
        
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
        return qutdEmpregado;
    }

    public void setQutdEmpregado(int qutdEmpregado) {
        this.qutdEmpregado = qutdEmpregado;
    }

   
    public String imprimirFuncionarios() {
        
        String s = "";
        for(int i = 0 ; i < qutdEmpregado ; i++){
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
