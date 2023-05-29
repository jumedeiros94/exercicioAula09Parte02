//Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes.
// A primeira vez com "for" e a segunda com "while".

package exercicioEstruturaDeRepeticaoParte2;

public class exercicio01 {
    public static void main(String[] args) {

        System.out.println("Contadores de 1 a 100");

        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("------------------------------");


        int contador = 1;

        while( contador <= 100 ) {
            System.out.println(contador);
            contador += 1;
        }


    }
}
