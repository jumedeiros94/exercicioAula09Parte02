//Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.

package exercicioEstruturaDeRepeticaoParte2;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        double maior, num;
        int count = 2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        num = entrada.nextDouble();
        maior = num;

        while(count <= 10){
            System.out.print("Numero " + count + ": ");
            num = entrada.nextDouble();

            if(num > maior){
                maior = num;
            }

            count++;
        }

        System.out.println("O maior numero digitado é: "+ maior);

    }

}
