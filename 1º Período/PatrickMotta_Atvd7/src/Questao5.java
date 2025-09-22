/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
05) Crie um vetor de 12 números inteiros e determine quantos números do vetor são pares.
*/


import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[12];
        int par = 0;

        for (int i = 0; i < vetor.length;i++) {
            System.out.print("Digite o "+(i+1)+"º numero inteiro: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Os números pares são: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                par++;
                System.out.print(vetor[i] + ", ");
            }
        }

        System.out.println();
        System.out.println("Desse vetor, "+par+" números são pares");

        sc.close();
    }
}
