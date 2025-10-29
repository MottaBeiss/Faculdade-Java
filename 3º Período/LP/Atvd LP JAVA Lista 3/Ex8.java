/* 8. Faça um programa que leia uma matriz 3x3 e mostre:
 • todos os seus elementos;
 • a soma dos elementos da diagonal principal.  */

import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int[][] matriz = new int [3][3];
        int somaDiagonal = 0;

        System.out.println("\nMatriz gerada:");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(1,15);

                 System.out.printf("%5d", matriz[i][j]);
                 if (i == j) {
                    somaDiagonal += matriz[i][j];
                 }
            }
            System.out.println();
        }



         System.out.println("\nSoma da diagonal: " + somaDiagonal + "\n");

    }
}