/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/01
*/

/*
7) Escreva um algoritmo que leia um vetor de 10 posições de números inteiros e faça a ordenação
em um outro vetor na ordem crescente dos números. Ao final, Imprima os dois vetores.
*/

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10], vetor2 = new int[vetor1.length];
        int temp;

        System.out.println("\nDigite 10 números:");
        System.out.println();
        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("%dº número: ", i+1);
            vetor1[i] = sc.nextInt();
            vetor2[i] = vetor1[i];
        }

        for (int i = 0; i < vetor1.length;) {
            for (int j = i + 1; j < vetor1.length;) {
                if (vetor2[i] > vetor2[j]) {
                    temp = vetor2[i];
                    vetor2[i] = vetor2[j];
                    vetor2[j] = temp;
                }
                j++;
            }
            i++;
        }

        System.out.print("\nVetores na ordem em que foram inseridos: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] +", ");
        }

        System.out.print("\nVetores em ordem Crescente: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor2[i]+", ");
        }

        sc.close();
    }
}