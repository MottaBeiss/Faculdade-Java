/*   9. Leia uma matriz 4x4 e exiba o maior valor armazenado e sua posição (linha e coluna).
*/

import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int[][] matriz = new int [4][4];
        int maior = matriz[0][0];

         System.out.println("\nMatriz gerada:");
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = gerador.nextInt(30);
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.print("\nMaior valor: " + maior);
    }
}
    
