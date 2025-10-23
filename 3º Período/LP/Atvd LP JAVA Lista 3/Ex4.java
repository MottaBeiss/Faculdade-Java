/*4. Elabore um programa que leia um vetor de 15 números inteiros e crie um segundo vetor que 
armazene os mesmos valores em ordem inversa.*/

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            int[] num = new int[15];
            int[] inverso = new int[num.length];


           System.out.println("Digite 15 números inteiros");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i+1 + "º: ");
            num[i] = sc.nextInt();
        }
            System.out.println("\n");

            System.out.println("Valores em ordem inversa:");
        for (int i = num.length - 1; i >= 0; i--) {
            inverso[i] = num[i];
            System.out.print(inverso[i] + " ");
        }
        
            System.out.println("\n");

        sc.close();
    }
}
