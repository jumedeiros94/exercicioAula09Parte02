//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

package exercicioEstruturaDeRepeticaoParte2;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Fatorial de: ");


        int numero = entrada.nextInt();
        int resultado = 1;
        int count = 1;

        while (count <= numero){
        resultado *= count;
        count += 1;
        }

        System.out.print(resultado);
    }
}
