import java.util.Scanner;

public class Question_7 { //DÚVIDA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 2 e 5:");
        int num = sc.nextInt();

        int[][] matriz = new int[num][num];
        int contador = 1;

        if (num < 2 || num > 5) {
            System.out.println("Número inválido");
        } else {
            matriz[0][0] = 1;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = contador++;
                }
            }
        }

        int[][] matrizResultado = new int[num][num];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int somaProdutos = 0;

                for (int k = 0; k < matriz[i].length; k++) {
                    somaProdutos += matriz[i][k] * matriz[k][j];
                }
                matrizResultado[i][j] = somaProdutos;
            }
        }

        System.out.println("\n Matriz Original:");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n Matriz Resultado: (Quadrado da Matriz):)");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.printf("%5d", matrizResultado[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
