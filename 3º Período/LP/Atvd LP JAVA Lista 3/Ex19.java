/*  19. Escreva uma função recursiva que conte quantos números pares existem em um vetor de 
inteiros. */

import java.util.Random;

public class Ex19 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int[] vet = new int [5];

        System.out.print("\nVetor: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = gerador.nextInt(10);
            System.out.print(vet[i] + " ");
        }

        System.out.printf("\nPares existentes no vetor: %d", pares(vet,0));
        System.out.println("\n");
    }

    public static int pares (int[] vet, int i) {
        if (i == vet.length) { 
            return 0;
        } 
        if (vet[i] % 2 == 0) {
            return 1 + pares(vet,i + 1); 
        }
        return pares(vet, i + 1);

    }

}
