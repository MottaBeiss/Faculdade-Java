/* 6. Faça um programa que leia 10 números inteiros e mostre quantas vezes cada número distinto 
aparece no vetor. */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] num = new int [10];               
        int[] vetDiferents = new int [num.length]; // Array auxiliar: Armazena cada número ÚNICO/DISTINTO.
        int[] frequen = new int [num.length];      // Array auxiliar: Armazena a contagem (frequência) de cada distinto.
        
        // Esta variável é o coração da lógica! Ela serve a dois propósitos:
        // 1 Ponteiro/Contador: Rastreia quantos números distintos foram encontrados 
        // 2 Aponta para a próxima posição LIVRE nos arrays vetDiferents e frequen.
        int caminhoVetDiferent = 0; 

        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%dº: ",i + 1);
            num[i] = sc.nextInt();
        }

        // --- FASE 1: CONTAR E CLASSIFICAR OS NÚMEROS ---
        
        // LAÇO EXTERNO (i): Percorre CADA número no array original 'num'.
        for (int i = 0; i < num.length; i++) {
            // Flag de Controle: Assume que o número atual é NOVO (não encontrado nos distintos).
            boolean encontrado = false;

            // LAÇO INTERNO (j): Percorre APENAS os números que JÁ FORAM classificados como distintos.
            // Limite: É 'caminhoVetDiferent', garantindo que só os itens válidos sejam verificados.
            for (int j = 0; j < caminhoVetDiferent; j++) {
                // CONDIÇÃO DE REPETIÇÃO: Compara o número lido (num[i]) com um número já distinto (vetDiferents[j]).
                if (num[i] == vetDiferents[j]) {
                    // Ação 1: Se for REPETIDO, incrementa a contagem na posição 'j' correta.
                    frequen[j] += 1;
                    // Ação 2: Marca o status como verdadeiro (foi encontrado).
                    encontrado = true;
                    // Ação 3 (Otimização): Para a busca imediatamente.
                    break;
                } 
            } // Fim do Laço Interno (j)

            // BLOC DE INSERÇÃO: Só executa se o número NÃO foi encontrado no laço acima.
            if (!encontrado) {
                // Ação 1: Adiciona o número novo na posição LIVRE atual.
                vetDiferents[caminhoVetDiferent] = num[i];
                // Ação 2: Inicializa a frequência desse novo número com 1.
                frequen[caminhoVetDiferent] = 1;
                // Ação 3 (CRÍTICA): Avança o ponteiro para a próxima posição livre.
                caminhoVetDiferent += 1;
            }
        } // Fim do Laço Externo (i)

        // --- Última fase: EXIBIÇÃO DOS RESULTADOS ---
        System.out.println();
        // LAÇO DE EXIBIÇÃO: Percorre APENAS os elementos válidos/preenchidos.
        // Limite: 'caminhoVetDiferent' (o total de números distintos).
        for (int i = 0; i < caminhoVetDiferent; i++) {
            System.out.print("Número: " + vetDiferents[i] + " frequência: ");
            System.out.print(frequen[i]);
            System.out.println();
        }

        sc.close();
    }
}
