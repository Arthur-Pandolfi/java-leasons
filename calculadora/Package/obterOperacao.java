package Package;
import java.util.Scanner;

public class ObterOperacao {
    @SuppressWarnings("resource")
    public static String obterOperacao() {
        Scanner scan = new Scanner(System.in);
        String operacao = "";

        while (true) {
            try {
                System.out.println("Digite a operação desejada (+, -, *, /): ");
                operacao = scan.nextLine();
                if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Operação inválida. Digite uma operação válida.");
            }
        }
        return operacao;
    }
}
