/* 14. Leia uma matriz 3x3 e verifique se ela é simétrica (ou seja, se matriz[i][j] == 
matriz[j][i]). */

import java.util.Random;

public class Ex14 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int matriz[][] = new int [3][3];

         System.out.println("\nMatriz gerada:");
        for (int i = 0; i < matriz.length; i++) {

             for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = gerador.nextInt(2);
                System.out.printf("%5d", matriz[i][j]);

            }
            System.out.println();
        }

        boolean simetrico = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] != matriz[j][i]) {
                    simetrico = false;
                } 
            }
        }

        if (simetrico) {
            System.out.println("\nA matriz é simétrica");
        } else {
            System.out.println("\nA matriz não é simétrica");
        }

        System.out.println();
        
    }

}
