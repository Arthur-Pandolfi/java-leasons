package unidades.packages;
import java.util.Scanner;

public class obterInputs {
    public static double input(int caso) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        double valor = 0.0;
        if (caso == 1) {
            while (true) {
                try {
                    valor = Double.parseDouble(scanner.nextLine());
                    if (valor > 5) {
                        System.out.println("Erro ao obter input, tente novamente.");
                    } else {
                        return valor;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro ao obter input, tente novamente.");
                }
            } 
        } else {
                while (true) {
                    try {
                        valor = Double.parseDouble(scanner.nextLine());
                        break;
                        
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao obter input, tente novamente.");
                    }
                }
                return valor;
            }
    }
}
