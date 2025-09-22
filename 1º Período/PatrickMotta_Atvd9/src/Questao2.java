/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/15
*/

/*
2) Crie uma matriz original 2x3. Peça ao usuário para preencher os elementos dessa matriz. Em
seguida, crie uma nova matriz que seja a transposta da matriz original (linhas viram colunas e
colunas viram linhas). Imprima ambas as matrizes
*/

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][3];
        int[][] matrizTransposta = new int[3][2];

        System.out.println("Preencha a matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Linha %d, %dº coluna: ",i+1,j+1);
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matriz em ordem correta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               matrizTransposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz Transposta");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}