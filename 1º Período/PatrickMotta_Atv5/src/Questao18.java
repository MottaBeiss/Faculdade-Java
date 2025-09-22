/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/12
 */

import java.util.Scanner;
public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nome = sc.nextLine();

        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura,2);
        int faixa = 0;

        if (imc < 20) {
            faixa = 1;
        } else if (imc < 24.9) {
            faixa = 2;
        } else if (imc < 29.9) {
            faixa = 3;
        } else if (imc < 34.9) {
            faixa = 4;
        } else {
            faixa = 5;
        }

        System.out.printf("IMC de %s: %.2f\n", nome, imc);

        switch (faixa) {
            case 1:
                System.out.println("Faixa de risco: Abaixo do peso");
                break;
            case 2:
                System.out.println("Faixa de risco: Normal");
                break;
            case 3:
                System.out.println("Faixa de risco: Excesso de peso");
                break;
            case 4:
                System.out.println("Faixa de risco: Obesidade");
                break;
            case 5:
                System.out.println("Faixa de risco: Obesidade mórbida");
                break;
            default:
                System.out.println("Erro ao classificar IMC.");
        }

        sc.close();
    }
}
