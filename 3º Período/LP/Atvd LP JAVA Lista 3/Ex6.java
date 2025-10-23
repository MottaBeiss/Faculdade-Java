/* 6. Faça um programa que leia 10 números inteiros e mostre quantas vezes cada número distinto 
aparece no vetor. */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] num = new int [5];
        int[] distintos = new int [num.length];
        int[] frequen = new int [num.length];
        int tamanhoDistintos = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%dº: ",i + 1);
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            boolean encontrado = false;

            for (int j = 0; j < tamanhoDistintos; j++) {
                if (num[i] == distintos[j]) {
                    frequen[j] += 1;
                    encontrado = true;
                    break;
                } 
            }
            if (!encontrado) {
                    distintos[tamanhoDistintos] = num[i];
                    frequen[tamanhoDistintos] = 1;
                    tamanhoDistintos += 1;
                }
        }

        for (int i = 0; i < tamanhoDistintos - 1; i++) {
            System.out.print("Número: " + distintos[i] + " frequência: ");
            System.out.print(frequen[i]);
            System.out.println("\n");
        }

        sc.close();
    }
}
