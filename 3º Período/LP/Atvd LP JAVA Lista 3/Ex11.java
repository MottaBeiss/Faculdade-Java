/* 11. Elabore um programa que leia duas matrizes 3x3 e gere uma terceira matriz contendo a soma 
das duas. */

import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int matriz[][] = new int [3][3];
        int matrizDois[][] = new int [matriz.length][matriz.length];
        int resultado[][] = new int [matriz.length][matriz.length];

        System.out.println("\nMatrizes geradas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(30);
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();

         for (int i = 0; i < matrizDois.length; i++) {
            for (int j = 0; j < matrizDois[i].length; j++) {
                matrizDois[i][j] = gerador.nextInt(30);
                System.out.printf("%5d", matrizDois[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nSoma das matrizes:");
         for (int i = 0; i < matrizDois.length; i++) {
            for (int j = 0; j < matrizDois[i].length; j++) {
                
                resultado[i][j] = matriz[i][j] + matrizDois[i][j];
                System.out.printf("%5d", resultado[i][j]);
            }
            System.out.println();
        }

    }

}
