/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
01) Crie um vetor de inteiros com 10 posições e preencha-o com valores fixos. Em seguida, imprima
todos os elementos do vetor em ordem direta e em ordem inversa.
*/


import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o "+(i+1)+"º numero inteiro: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Inteiros em ordem direta: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + ", ");
        }

        System.out.print("\nInteiros em ordem inversa: ");
        for (int i = 9; i >= 0 ; i--) { // "length" mostra quantidade e o vetor mostra posição (índice)
            System.out.print(vetor[i]+", "); // As aspas faz criar um espaço entre cada número
        }

        sc.close();
    }
}
