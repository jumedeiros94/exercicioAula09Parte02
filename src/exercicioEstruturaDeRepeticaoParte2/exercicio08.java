//Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.

package exercicioEstruturaDeRepeticaoParte2;
public class exercicio08 {
    public static void main(String[] args) {

        int i = 0;
        int soma = 0;

        for (i = 1; i <=50; i++){
            if (i % 2 == 1){
                soma += i;
            }
        }

        System.out.println("A soma dos números impares de 1 a 50: " + soma);
    }
}
