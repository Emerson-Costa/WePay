
package classes;

public class CartaoPonto{
    private Empregado empregado;
    
    private String horaChegada;
    private String minChegada;
    private String horaSaida;
    private String minSaida;

   
    public String Informacoes() {
        return "empregado: " + empregado.getNome() + "\nhoraChegada: " + horaChegada + ":" + minChegada + "\nhoraSaida: " + horaSaida + ":" + minSaida+"\n\n";
    }
    

    public CartaoPonto(Empregado empregado, String horaChegada, String minChegada, String horaSaida, String minSaida) {
        this.empregado   = empregado;
        this.horaChegada = horaChegada;
        this.minChegada  = minChegada ;
        this.horaSaida   = horaSaida  ;  
        this.minSaida    = minSaida   ;
    }
    
   /* public float calcularHorasTrabalhadas(){
        
        int contHora=0;
        for(int i = horaChegada ; i <= horaSaida ; i++){
            contHora++;
        }
        
        int contMin=0;
        for(int i = minChegada ;  i <= minSaida  ; i++){
            contMin++;
        }
        
        return 1;
    }*/

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getMinChegada() {
        return minChegada;
    }

    public void setMinChegada(String minChegada) {
        this.minChegada = minChegada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getMinSaida() {
        return minSaida;
    }

    public void setMinSaida(String minSaida) {
        this.minSaida = minSaida;
    }
  
}
