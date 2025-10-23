import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Insira 9 valores para calcular o determinante da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaPrincipal = (matriz[0][0] * matriz[1][1] * matriz[2][2])
                          + (matriz[0][1] * matriz[1][2] * matriz[2][0])
                          + (matriz[0][2] * matriz[1][0] * matriz[2][1]);

        int somaSecundaria = (matriz[0][2] * matriz[1][1] * matriz[2][0])
                           + (matriz[0][1] * matriz[1][0] * matriz[2][2])
                           + (matriz[0][0] * matriz[1][2] * matriz[2][1]);

        System.out.println("\nValor determinante da matriz = " + (somaPrincipal - somaSecundaria));


        sc.close();

        //fazer de outra forma
    }
}
