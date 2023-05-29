//Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
// O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa
// deve somar todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo
// inválido (começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na
// tela, “Intervalo de valores inválido” e o programa termina.

package exercicioEstruturaDeRepeticaoParte2;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro intervalo");
        int intervalo1 = entrada.nextInt();
        int intervalo2;

        do {
            System.out.println("Informe o valor do segundo intervalo");
            intervalo2 = entrada.nextInt();
            if (intervalo2 < intervalo1){
                System.out.println("Segundo intervalo inválido");
            }
        }while (intervalo2 < intervalo1);

        int soma =0;

        for (int i = intervalo1; i<=intervalo2; i++) {
            if ( !(i%2==0)) {
                soma +=i;
            }
        }
        System.out.println("Números impares dos intervalos " +  intervalo1  + " " +  intervalo2 + " " +  soma);

    }
}
