/* 1. Crie um programa que leia 10 números inteiros e armazene-os em um vetor. Em seguida, exiba 
apenas os números pares e suas respectivas posições no vetor.*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] num = new int[10];

        System.out.println("Digite 10 números inteiros");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i+1 + "º número: ");
            num[i] = sc.nextInt();
        }

        System.out.println("Números pares presentes no vetor: ");
        for (int i = 0; i < num.length; i++) {
             if (num[i] % 2 == 0) {
                System.out.println("Número: " + num[i] + ", Posição: " + i);
             }
        }



        sc.close();
    }

}
