
package classes;

public class CartaoPonto{
    private Empregado empregado;
    
    private String horaChegada;
    private String minChegada;
    private String horaSaida;
    private String minSaida;
    int totalHorasTrabalhadas;
    String horasTrabalhadas;
   
    public String toString() {
        return "empregado: " + empregado.getNome() + "\nhora Chegada: " + horaChegada + ":" + minChegada + "\nhora Saida: " + horaSaida + ":" + minSaida+"\nhoras Trabalhadas: "+horasTrabalhadas+"\n\n";
    }
    

    public CartaoPonto(Empregado empregado, String horaChegada, String minChegada, String horaSaida, String minSaida) {
        this.empregado   = empregado;
        this.horaChegada = horaChegada;
        this.minChegada  = minChegada ;
        this.horaSaida   = horaSaida  ;  
        this.minSaida    = minSaida   ;
        calcularHorasTrabalhadas();
    }
    
    public void calcularHorasTrabalhadas(){
        
        int horaChegada1 =  Integer.parseInt(horaChegada);  
        int minChegada1  =  Integer.parseInt(minChegada);   
        int horaSaida1   =  Integer.parseInt(horaSaida);
        int minSaida1    =  Integer.parseInt(minSaida);
        
        int contHoras=0;
        for(int i = horaChegada1; i < horaSaida1; i++){
            contHoras++;
        }
        
        int minutos = minChegada1 + minSaida1;
        int contMin=0;
        for(int i = 0 ; i < minutos;i++){
            contMin++;
            if(contMin > 59){
              contHoras += 1;
              contMin=0;
            }
        }
        totalHorasTrabalhadas += contHoras;
        horasTrabalhadas = contHoras+":"+contMin;
    }

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
