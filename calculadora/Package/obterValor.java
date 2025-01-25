package Package;
import java.util.Scanner;

public class ObterValor {
    public static double obterValor() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        Double valor = 0.0;

        while (true) {
            try {
                System.out.println("Digite um valor: ");
                String scanString = scan.nextLine();
                valor = Double.parseDouble(scanString);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número.");
            }
        }
        return valor;
    }
} 
