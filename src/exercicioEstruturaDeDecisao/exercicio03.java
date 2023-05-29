package exercicioEstruturaDeDecisao;

//Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular
// a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// A mensagem "Reprovado", se a média for menor do que sete;
// A mensagem "Aprovado com Distinção", se a média for igual a dez.

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda  nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Sua média é de: " + media);

        if(media >= 7 && media != 10){
            System.out.println("Você foi aprovado!");
        }else if (media < 7){
            System.out.println("Você foi reprovado");
        }else{
            System.out.println("Você foi aprovado com distinção");
        }

    }
}
