package exercicioEstruturaDeDecisao;

//Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e
// lhe contrataram para desenvolver o programa que calcula os reajustes. Portanto, faça um
// programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado
// no salário atual:
// Salários até R$ 280,00 (incluindo), receberão aumento de 20%
// Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
// Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
//Salários de R$ 1500,00 em diante, receberão aumento de 5%
//Após o aumento ser realizado, informe na tela:
//O salário antes do reajuste;
//O percentual de aumento aplicado;
// O valor do aumento;
//O novo salário, após o aumento;


import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu salário? ");
        double salario = entrada.nextDouble();

        if (salario <= 280){
            double aumento = (salario * 0.20);
            double porcentagemAumento = 20;
            double salariocomAumento = salario + aumento;

            System.out.println("(-)  O salário antes do reajuste R$" + salario);
            System.out.println("(-)  O percentual de aumento aplicado " + porcentagemAumento + "%");
            System.out.println("(-)  O valor do aumento R$" + aumento);
            System.out.println("(-)  O novo salário após o aumento R$" + salariocomAumento);

        } else if (salario > 280 && salario <= 700){
            double aumento = (salario * 0.15);
            double porcentagemAumento = 15;
            double salariocomAumento = salario + aumento;

            System.out.println("(-)  O salário antes do reajuste R$" + salario);
            System.out.println("(-)  O percentual de aumento aplicado " + porcentagemAumento + "%");
            System.out.println("(-)  O valor do aumento R$" + aumento);
            System.out.println("(-)  O novo salário após o aumento R$" + salariocomAumento);

        } else if (salario > 700 && salario <= 1500){
            double aumento = (salario * 0.10);
            double porcentagemAumento = 10;
            double salariocomAumento = salario + aumento;

            System.out.println("(-)  O salário antes do reajuste R$" + salario);
            System.out.println("(-)  O percentual de aumento aplicado " + porcentagemAumento + "%");
            System.out.println("(-)  O valor do aumento R$" + aumento);
            System.out.println("(-)  O novo salário após o aumento R$" + salariocomAumento);

        } else if (salario > 1500) {
            double aumento = (salario * 0.05);
            double porcentagemAumento = 5;
            double salariocomAumento = salario + aumento;

            System.out.println("(-)  O salário antes do reajuste R$" + salario);
            System.out.println("(-)  O percentual de aumento aplicado " + porcentagemAumento + "%");
            System.out.println("(-)  O valor do aumento R$" + aumento);
            System.out.println("(-)  O novo salário após o aumento R$" + salariocomAumento);
        }
    }
}
