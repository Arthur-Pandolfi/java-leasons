package unidades;
import unidades.packages.obterInputs;
import unidades.packages.conversao;

public class Main {
    public static void main(String[] args) {
        // Capta a operação desejada
        System.out.println("Digite a operação desejada:\n1 - Metro para CM\n2 - Metro para KM\n3 - Metro para MM\n4 - Celsius para F\n5 - Celsius para K");
        int caso = (int) obterInputs.input(1);
        System.out.println();

        // Capta o valor a ser convertido
        System.out.println("Digite o valor a ser convertido:");
        double valor = obterInputs.input(2);
        double resultado = conversao.converter(caso, valor);
        System.out.println("Resultado: " + resultado);

    }
}
