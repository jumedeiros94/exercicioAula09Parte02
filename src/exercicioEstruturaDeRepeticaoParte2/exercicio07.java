//Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
// Um número primo é aquele que é divisível somente por ele mesmo e por 1

package exercicioEstruturaDeRepeticaoParte2;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");

        int num = entrada.nextInt();
        int i = 0;
        int resultado = 0;

        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                resultado++;
            }
        }

        if (resultado == 0){
            System.out.print("O número é primo ");
        }else {
            System.out.print("O número não é primo ");
        }
    }
}
