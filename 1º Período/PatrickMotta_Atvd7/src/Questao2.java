/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
02) Crie um vetor de reais com 10 posições e preencha-o com valores fixos. Em seguida, imprima
todos os elementos do vetor em ordem direta e em ordem inversa.
*/

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[10];

        for (int i = 0; i < vetor.length;) {
            System.out.print("Digite o "+(i+1)+"º numero real: ");
            vetor[i] = sc.nextDouble();
            i++;
        }

        System.out.println();

        System.out.print("Reais em ordem direta: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }

        System.out.print("\nReais em ordem inversa: ");
        for (int i = vetor.length - 1; i >= 0 ; i--) { // "length" mostra quantidade e o vetor mostra posição (índice)
            System.out.print(vetor[i]+", "); // As aspas faz criar um espaço entre cada número
        }

        sc.close();
    }
}

