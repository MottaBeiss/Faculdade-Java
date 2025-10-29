/*  7. Crie uma função em Java que receba um vetor de números inteiros e retorne a média aritmética 
dos elementos. */

import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {

         int[] num = new int [10];
         int soma = 0;

         Random gerador = new Random();

         for (int i = 0; i < num.length; i++) {
            num[i] = gerador.nextInt(10);
            soma += num[i];
         }

         System.out.println("Números do vetor:");
         for (int i = 0; i < num.length; i++) {
         System.out.print(num[i] + " ");
         } 

         System.out.println("\nMédia: " + (double)soma / num.length);

    }

}
