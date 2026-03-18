/*2. Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e 100. Percorrendo o vetor criado 
apenas uma vez, imprima a posição onde ocorre o menor o valor, a soma dos números armazenados e preencha os valores de um novo vetor 
com metade do tamanho do vetor original onde a primeira posição do novo vetor é igual à soma da primeira e da última posição do vetor 
original. A segunda posição do novo vetor é a soma da segunda e da penúltima posição do vetor original e assim em diante */

import java.util.Random;

public class EX2 {
    public static void main(String[] args) {
        int[] vetorOriginal = new int[100];
        int[] vetorSomas = new int[50];
        Random numRandomico = new Random(); // [cite: 92]
        
        // --- PASSO 1: Preenchimento do vetor ---
        for(int i = 0; i < 100; i++) {
            vetorOriginal[i] = numRandomico.nextInt(101); // Números entre 0 e 100 
        }

        int menorValor = Integer.MAX_VALUE; // [cite: 107]
        int posicaoMenor = -1;
        int somaTotal = 0;

        // --- PASSO 2: Processamento (Percorrendo apenas uma vez)  ---
        for(int i = 0; i < 100; i++) {
            // 1. Acumula a soma 
            somaTotal += vetorOriginal[i];

            // 2. Verifica o menor valor e sua posição 
            if(vetorOriginal[i] < menorValor) {
                menorValor = vetorOriginal[i];
                posicaoMenor = i;
            }

            // 3. Preenche o novo vetor com a soma das extremidades [cite: 295, 296]
            // Fazemos isso apenas até o índice 49 para não estourar o vetor de 50 posições
            if (i < 50) {
                vetorSomas[i] = vetorOriginal[i] + vetorOriginal[99 - i];
            }
        }

        // --- PASSO 3: Exibição para Conferência ---
        System.out.println("=== VETOR ORIGINAL (100 posições) ===");
        for(int i = 0; i < 100; i++) {
            System.out.print("[" + i + "]:" + vetorOriginal[i] + "  ");
            if ((i + 1) % 10 == 0) System.out.println(); // Quebra linha a cada 10 números
        }

        System.out.println("\n=== VETOR DE SOMAS (Extremidades) ===");
        for(int i = 0; i < 50; i++) {
            System.out.println("Posição " + i + ": " + vetorOriginal[i] + " + " + vetorOriginal[99-i] + " = " + vetorSomas[i]);
        }

        System.out.println("\n=== RESULTADOS FINAIS ===");
        System.out.println("Menor valor encontrado: " + menorValor);
        System.out.println("Posição do menor valor: " + posicaoMenor);
        System.out.println("Soma total de todos os elementos: " + somaTotal);
    }
}
