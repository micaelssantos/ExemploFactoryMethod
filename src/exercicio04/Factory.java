package exercicio04;

/**
 *
 * @author Micael de Sousa Santos
 */
public class Factory {

    public static Instrumento construtorInstrumento(EnumInstrumento instumento) {
        switch (instumento) {
            case DetectorAmonia:
                return new DetectorAmonia();

            case Termometro:
                return new Termometro();
                
            default:
                throw new IllegalArgumentException("Erro! Instumento não Existe!");
        }
    }

}
