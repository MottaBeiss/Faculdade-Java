/*4. Escreva um programa que ordene um vetor de tamanho arbitrário preenchido com números aleatórios e execute a pesquisa por um valor 
passado como parâmetro utilizando o algoritmo da busca binária */

import java.util.Random;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        
        // 1. Preenchendo com números aleatórios
        for(int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(101); // [cite: 299]
        }
        
        // 2. Ordenação manual (Bubble Sort) - Necessário para a Busca Binária 
        for(int i = 0; i < tamanho - 1; i++) {
            for(int j = 0; j < tamanho - 1 - i; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux; // [cite: 205, 210]
                }
            }
        }
        
        // 3. Exibindo o vetor para conferência
        System.out.println("\n--- Vetor Ordenado (para conferência) ---");
        for(int i = 0; i < tamanho; i++) {
            System.out.print("[" + i + "]:" + vetor[i] + "  ");
            if ((i + 1) % 10 == 0) System.out.println(); 
        }
        System.out.println("\n-----------------------------------------");

        boolean encontrado = false;

        // 4. Laço que só encerra ao encontrar um valor válido
        while (!encontrado) {
            System.out.print("\nDigite um valor que ESTEJA no vetor para pesquisar: ");
            int valorProcurado = scanner.nextInt();
            
            // Implementação manual da Busca Binária [cite: 213]
            int inicio = 0;
            int fim = tamanho - 1;
            
            while(inicio <= fim) {
                // Cálculo da posição central: meio = (inicio + fim) / 2 [cite: 228, 246]
                int meio = (inicio + fim) / 2; 
                
                if(vetor[meio] == valorProcurado) {
                    System.out.println("SUCESSO! Valor " + valorProcurado + " encontrado na posição: " + meio);
                    encontrado = true; // Quebra o laço externo (while)
                    break; // Quebra o laço da busca binária
                } else if(valorProcurado < vetor[meio]) {
                    // Se o valor é menor que o meio, descarta a metade direita [cite: 219]
                    fim = meio - 1; 
                } else {
                    // Se o valor é maior que o meio, descarta a metade esquerda [cite: 220]
                    inicio = meio + 1; 
                }
            }
            
            if(!encontrado) {
                System.out.println("Erro: O valor " + valorProcurado + " não foi encontrado. Tente novamente!");
            }
        }
        
        System.out.println("Programa finalizado com sucesso.");
        scanner.close();
    }
}
