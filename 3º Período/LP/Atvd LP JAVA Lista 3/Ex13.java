/*  13. Faça um programa que leia uma matriz 3x3 e exiba a soma dos elementos de cada linha e de 
cada coluna separadamente. */

import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int matriz[][] = new int [3][3];
        int sL1 = 0; 
        int sL2 = 0;
        int sL3 = 0;
        int sC1 = 0;
        int sC2 = 0;
        int sC3 = 0;

        System.out.println("\nMatriz gerada:");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = gerador.nextInt(30);
                System.out.printf("%5d", matriz[i][j]);

                switch (i) {
                    case 0:
                        sL1 += matriz[i][j];
                        break;
                    case 1:
                        sL2 += matriz[i][j];
                        break;
                    case 2:
                        sL3 += matriz[i][j];
                        break;
                }

                switch (j) {
                    case 0:
                        sC1 += matriz[i][j];
                        break;
                    case 1:
                        sC2 += matriz[i][j];
                        break;
                    case 2:
                        sC3 += matriz[i][j]; 
                        break;
                }
                
            }
            System.out.println();
        }

        System.out.println("\n---RESULTADO DAS SOMAS---");
        System.out.printf("\nLinha um: %d", sL1);
        System.out.printf("\nLinha dois: %d", sL2);
        System.out.printf("\nLinha três: %d", sL3);
        System.out.printf("\nColuna um: %d", sC1);
        System.out.printf("\nColuna dois: %d", sC2);
        System.out.printf("\nColuna três: %d", sC3);
        System.out.println("\n");
        
    }

}

