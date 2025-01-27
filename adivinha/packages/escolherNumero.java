package adivinha.Packages;
import java.util.Random;

public class escolherNumero {
    public static int adquirirValor() {
        Random numero = new Random();
        return numero.nextInt(20);
    }
}
