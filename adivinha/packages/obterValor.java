package adivinha.Packages;
import java.util.Scanner;

public class obterValor {
    public static int adquirirValor() {
        Scanner scanner = new Scanner(System.in);
        String sacnResult = "";
        byte valor = 0;
        byte valor_max = 20;

        // Obtem o valor
        while (true) {
            try {
                sacnResult = scanner.nextLine();
                valor = Byte.parseByte(sacnResult);
                // Verifica se o valor é maior que 20
                if (valor > valor_max) {
                    System.out.println("Valor inválido. Digite um número menor que 50.");
                    continue;
                } else {
                    return valor;
                }  
            } catch (Exception e) {
                System.out.println("Valor inválido. Digite um número inteiro até 20.");
            }
        }
    }
}
