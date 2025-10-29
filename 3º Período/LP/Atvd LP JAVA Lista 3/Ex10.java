/* 10. Crie uma matriz 5x5 e preencha:
 • a diagonal principal com 0,
 • as posições acima com 1,
 • e as posições abaixo com -1.
 */

public class Ex10 {
    public static void main(String[] args) {

        int[][] matriz = new int [5][5];

        System.out.println("\nMatriz gerada:");
        for (int i = 0; i < matriz.length; i++) {

             for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    matriz[i][j] = 0;
                } else if (j > i) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = -1;
                }
                
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
        
    }

}

/*             [0][0]              [0][1] [0][2] [0][3][0][4]
 * [1][0]           [1][1]                [1][2] [1][3][1][4]
 * [2][0] [2][1]          [2][2]                 [2][3][2][4]
 * [3][0] [3][1] [3][2]         [3][3]                 [3][4]
 * [4][0] [4][1] [4][2] [4][3]        [4][4]
 * 
 * i == j = 0
 * 
 * [0][0] [0][1] [0][2] [0][3] [0][4]    
 * [1][0] [1][1] [1][2] [1][3] [1][4]
 * [2][0] [2][1] [2][2] [2][3] [2][4]
 * [3][0] [3][1] [3][2] [3][3] [3][4]
 * [4][0] [4][1] [4][2] [4][3] [4][4]
 * 
 * 
 * 
 */