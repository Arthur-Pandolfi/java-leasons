package unidades.packages;

public class conversao {
    public static double converter(int caso, double entrada) {
        if (caso == 1) { // Metro pra CM
            return entrada * 100;
        } else if (caso == 2) { // Metro para KM
            return entrada / 100;
        } else if (caso == 3) { // Metro para MM
            return entrada * 1000;
        } else if (caso == 4) { // Celsius para F
            return (entrada * 9/5) + 32;
        } else if (caso == 5) { // Celsius para K
            return entrada + 273.15;
        } else {
            return 0.0;
        }
    }
}
