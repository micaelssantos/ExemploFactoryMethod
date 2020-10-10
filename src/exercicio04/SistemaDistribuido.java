package exercicio04;

/**
 *
 * @author Micael de Sousa Santos
 */
public class SistemaDistribuido {

    public static void main(String[] args) {

        System.out.println(Factory.construtorInstrumento(
                EnumInstrumento.DetectorAmonia).getInstumento());
        
        System.out.println(Factory.construtorInstrumento(
                EnumInstrumento.Termometro).getInstumento());
    }

}
