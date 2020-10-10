package exercicio04;

/**
 *
 * @author Micael de Sousa Santos
 */
public class DetectorAmonia implements Instrumento{
    
    private int ppm = 15;

    @Override
    public String getInstumento() {
        return "Foi instanciado um Detector de Amonia com valor ajustado para: " + 15 + "ppm";
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }
    
}
