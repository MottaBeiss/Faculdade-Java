import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite as dimensões das matrizes que serão calculadas,\n" +
                           "a única regra é que o número de colunas da primeira matriz\n" +
                           "deve ser igual ao número de linhas da segunda:");

        System.out.print("\nNúmero de linhas da primeira matriz: ");
        int dim1L = sc.nextInt();
        System.out.print("Número de colunas: ");
        int dim1C = sc.nextInt();

        int[][] matriz1 = new int[dim1L][dim1C];

        System.out.println("\nAgora preencha a matriz:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.printf("Posição: [%d][%d] = ",i,j);
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nNúmero de linhas da segunda matriz: ");
        int dim2L = sc.nextInt();
        System.out.print("Número de colunas: ");
        int dim2C = sc.nextInt();

        int[][] matriz2 = new int[dim2L][dim2C];

        System.out.println("\nPreencha os dados:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.printf("Posição: [%d][%d] = ",i,j);
                matriz2[i][j] = sc.nextInt();
            }
        }

        int[][] matrizResultado = new int[dim1L][dim2C];

        if (dim1C != dim2L) {
            System.out.println("\nImpossivel multiplicar as matrizes");
        } else {
            for (int i = 0; i < dim1L; i++) {
                for (int j = 0; j < dim2C; j++) {
                    int somaProdutos = 0;

                    for (int k = 0; k < dim1C; k++) {
                        somaProdutos += matriz1[i][k] * matriz2[k][j];
                    }
                    matrizResultado[i][j] = somaProdutos;
                }
            }

            System.out.println("\n Matrizes Calculadas:");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < dim1C; j++) {
                    System.out.printf("%5d", matriz1[i][j]);
                }
                System.out.println();
            }

            System.out.println("--------X--------");

            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < dim2C; j++) {
                    System.out.printf("%5d", matriz2[i][j]);
                }
                System.out.println();
            }

            System.out.println("\n Matriz Resultado: (Quadrado da Matriz):)");
            for (int i = 0; i < dim1L; i++) {
                for (int j = 0; j < dim2C; j++) {
                    System.out.printf("%5d", matrizResultado[i][j]);
                }
                System.out.println();
            }
        }


        sc.close();
    }
}
