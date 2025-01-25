import java.util.Scanner;
import Package.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor1 = ObterValor.obterValor();
        double valor2 = ObterValor.obterValor();
        String operacao = ObterOperacao.obterOperacao();

        if (operacao.equals("+")) {
            System.out.println("Resultado: " + (valor1 + valor2));
        } else if (operacao.equals("-")) {
            System.out.println("Resultado: " + (valor1 - valor2));
        } else if (operacao.equals("*")) {
            System.out.println("Resultado: " + (valor1 * valor2));
        } else if (operacao.equals("/")) {
            System.out.println("Resultado: " + (valor1 / valor2));
        }
        scan.close();
    }
}
