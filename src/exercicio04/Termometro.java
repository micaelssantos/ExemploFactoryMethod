package exercicio04;

/**
 *
 * @author Micael de Sousa Santos
 */
public class Termometro implements Instrumento{

    private int temperatura = 50;

    @Override
    public String getInstumento() {
        return "Foi instanciado um termômetro com valor ajustado para: " + temperatura + "ºC";
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    

}
