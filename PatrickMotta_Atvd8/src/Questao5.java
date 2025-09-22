/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/01
*/

/*
5) Escreva uma algoritmo que leia um vetor de 20 elementos e conte quantos valores pares existem
no vetor.
*/

import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];
        int par = 0;

        System.out.println("\nDIGITE 20 VALORES:");
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%dº valor: ",i+1);
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                par++;
            }
        }

        if (par == 0) {
            System.out.print("\nNão ha nenhum valor par dentro do vetor.");
        } else if (par == 1) {
            System.out.printf("\nExiste %d valor par no vetor.", par);
        } else {
            System.out.printf("\nExistem %d valores pares no vetor.", par);
        }


        sc.close();
    }
}