

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int[] par = new int[num.length];
        int[] impar = new int[num.length];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i+1 + "º número: ");
            num[i] = sc.nextInt();
        }

        System.out.println("\nRESULTADO:");
        System.out.print("Números pares: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                par[i] = num[i];
                System.out.print(par[i] + " ");
            }
        }

        System.out.println("\n");

        System.out.print("Números impares: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                impar[i] = num[i];
                System.out.print(impar[i] + " ");
            }
        }

        System.out.println("\n");

        sc.close();
    }
}