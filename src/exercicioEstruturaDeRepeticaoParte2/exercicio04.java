//Faça um programa que leia n números positivos e calcule a soma desses números.

package exercicioEstruturaDeRepeticaoParte2;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String opcao = "s";
        int cont = 0;
        int soma = 0;
        int num;

        while (opcao.equalsIgnoreCase("S")) {
            System.out.println("Digite um número positivo e inteiro: ");
            num = entrada.nextInt();
            soma = soma + num;
            System.out.println("Deseja entrar com outro numero? (s/n): ");
            opcao = entrada.next();
            cont++;

            }


        System.out.println("A soma dos números digitados é: " + soma);


    }
}
