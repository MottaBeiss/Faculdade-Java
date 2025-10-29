/* 18. Faça uma função recursiva que receba um vetor de inteiros e retorne a soma de todos os 
elementos do vetor. */

import java.util.Random;

public class Ex18 {

    public static int somaVet (int[] vet, int i) {
        if (i == vet.length) {
            return 0;
        } 
        return vet[i] + somaVet(vet, i + 1);

    }
    public static void main(String[] args) {
        Random gerador = new Random();

        int[] vet = new int [2];

        System.out.print("\nVetor: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = gerador.nextInt(10);
            System.out.print(vet[i] + " ");
        }

        System.out.println("\nSoma dos elementos: " + somaVet(vet,0));
        System.out.println();

    }

}
