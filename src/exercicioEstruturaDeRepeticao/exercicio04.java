package exercicioEstruturaDeRepeticao;

//Escreva, usando while, um programa para calcular a média de N números.
// O valor de N é dado pelo usuário.

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String opcao = "s";
        int cont = 0;
        double media;
        double soma = 0;
        double num;

        while (opcao.equalsIgnoreCase("S")) {
            System.out.println("Digite um numero: ");
            num = entrada.nextDouble();
            soma = soma + num;
            System.out.println("Deseja entrar com outro numero? (s/n): ");
            opcao = entrada.next();
            cont++;

        }

        media = (soma / cont);
        System.out.println("A média dos numeros digitados é: " + media);
    }
}
