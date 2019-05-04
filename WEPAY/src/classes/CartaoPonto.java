
package classes;

public class CartaoPonto{
    private Empregado empregado;
    
    private String horaChegada;
    private String minChegada;
    private String horaSaida;
    private String minSaida;
    int totalHorasTrabalhadas;
   
    public String Informacoes() {
        return "empregado: " + empregado.getNome() + "\nhora Chegada: " + horaChegada + ":" + minChegada + "\nhora Saida: " + horaSaida + ":" + minSaida+"\nhoras Trabalhadas: "+totalHorasTrabalhadas+"\n\n";
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
        
        int min  =  Integer.parseInt(minChegada)  + Integer.parseInt(minSaida);
        int hora =  Integer.parseInt(horaChegada) + Integer.parseInt(horaSaida);
        
        int minSobrados=min;
        for(int i = 0 ; i <= min ; i++){ 
           if(min > 59){
             hora = hora + 1;
             minSobrados -= i; //utilizar os minutos quando chegar a hora certa
           }
        }
        totalHorasTrabalhadas += hora;
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
