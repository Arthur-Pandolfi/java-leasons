package adivinha;
import adivinha.Packages.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Escolha um número entre 0 e 20 para começar.");
        int valorDesejado = obterValor.adquirirValor();
        int valorEscolhido = escolherNumero.adquirirValor();

        while (valorDesejado != valorEscolhido) {
            System.out.println("Você digitou um número diferente do que a máquina escolheu! Tenta novamente.");
            valorDesejado = obterValor.adquirirValor();
        }
    }
}
