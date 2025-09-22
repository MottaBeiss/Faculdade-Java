/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/01
*/

/*
8) Escreva um algoritmo que leia um vetor de 10 elementos inteiros, encontre e mostre o menor
elemento, o maior elemento e as suas respectivas posições no vetor.
*/

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int indiceMaior = 0, indiceMenor = 0;
        int menor = 0, maior = 0 ;

        System.out.println("\nDigite 10 números:");
        System.out.println();
        for (int i = 0; i < vetor1.length;i++) {
            System.out.printf("%dº número: ", i+1);
            vetor1[i] = sc.nextInt();

            if (i == 0) {
                // O primeiro número é o menor e o maior até agora
                menor = vetor1[i];
                maior = vetor1[i];
            } else {
                if (vetor1[i] < menor) {
                    menor = vetor1[i];
                    indiceMenor = i;
                }
                if (vetor1[i] > maior) {
                    maior = vetor1[i];
                    indiceMaior = i;
                }
            }
        }

        System.out.printf("%nMenor número do vetor: %d Localizado no índice [%d] do vetor%n", menor, indiceMenor);
        System.out.printf("Maior número do vetor: %d Localizado no índice [%d] do vetor", maior, indiceMaior);

        sc.close();
    }
}
