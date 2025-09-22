/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
04) Crie um vetor de 8 números reais e calcule a média aritmética dos valores armazenados, com duas
casas decimais.
*/

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[8];
        double soma = 0;

        for (int i = 0; i < vetor.length;) {
            System.out.print("Digite o "+(i+1)+"º numero real: ");
            vetor[i] = sc.nextDouble();
            i++;
        }

        for(int i = 0; i<vetor.length; i++){
            soma = soma + vetor[i];
        }

        double media = soma/vetor.length;

        System.out.printf("Média: %.2f",media);

        sc.close();
    }
}

