//Faça um programa que leia n números inteiros e imprima sua média

package exercicioEstruturaDeRepeticaoParte2;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String opcao = "s";
        int cont = 0;
        int media;
        int soma = 0;
        int num;

        while (opcao.equalsIgnoreCase("S")) {
            System.out.println("Digite um numero: ");
            num = entrada.nextInt();
            soma = soma + num;
            System.out.println("Deseja entrar com outro numero? (s/n): ");
            opcao = entrada.next();
            cont++;

        }

        media = (soma / cont);
        System.out.println("A média dos numeros digitados é: " + media);

    }
}
