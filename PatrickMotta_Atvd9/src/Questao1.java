/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/15
*/

/*
1) Crie uma matriz de inteiros 3x3 (3 linhas e 3 colunas) e preencha-a com valores da sua escolha. Em
seguida, percorra a matriz e imprima todos os seus elementos no console, formatando a saída
para que se pareça com a matriz original (linhas e colunas).
*/

import java.util.Random;
public class Questao1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matriz = new int[3][3];

        System.out.println("VALORES GERADOS");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

    }
}