/*  12. Crie uma matriz 4x4 e conte quantos valores maiores que 10 ela possui.
 */

import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int matriz[][] = new int [4][4];
        int maiorDez = 0;

        System.out.println("\nMatriz gerada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(30);
                System.out.printf("%5d", matriz[i][j]);

                if (matriz[i][j] > 10) {
                    maiorDez ++;
                }
            }
            System.out.println();
        }

        System.out.println("\nA matriz possui " + maiorDez + " número(s) maior(es) que dez\n");


    }

}
