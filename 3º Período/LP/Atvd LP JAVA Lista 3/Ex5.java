/* 5. Crie um programa que receba um vetor de 30 números inteiros e calcule a soma dos múltiplos 
de 5 contidos nele. */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] num = new int[30];
        int soma = 0;

        System.out.println("Digite 30 números inteiros:");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%dº: ",i + 1);
            num[i] = sc.nextInt();
     
        }

         System.out.print("\nMúltiplos de cinco presentes no vetor: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 5 == 0) {
                System.out.print(num[i] + " ");
                soma += num[i];
            }
        }

        System.out.println("\nSoma dos múltiplos: " + soma);
                             

        sc.close();
    }

}
