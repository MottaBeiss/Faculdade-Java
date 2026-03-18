/*5. Implemente dois algoritmos que ordenem os elementos de um vetor em ordem crescente e compare o número de trocas que eles efetuam 
durante a ordenação de:
a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente */

import java.util.Random;

public class EX5 {
    
    // Método Bubble Sort: Compara e troca elementos adjacentes [cite: 201, 203]
    public static void rodarBubbleSort(int[] vetor, String cenario) {
        int trocas = 0;
        int n = vetor.length;
        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(vetor[j] > vetor[j + 1]) { // [cite: 204]
                    int aux = vetor[j]; // [cite: 205]
                    vetor[j] = vetor[j + 1]; // [cite: 208]
                    vetor[j + 1] = aux; // [cite: 210]
                    trocas++;
                }
            }
        }
        System.out.println("Bubble Sort (" + cenario + "): " + trocas + " trocas realizadas.");
    }
    
    // Método Selection Sort: Busca o menor e troca apenas uma vez por rodada
    public static void rodarSelectionSort(int[] vetor, String cenario) {
        int trocas = 0;
        int atualizacoesMinimo = 0; // Nova contagem solicitada
        int n = vetor.length;
        
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            
            for (int j = i + 1; j < n; j++) {
                // Verificando se encontramos um valor menor que o atual "candidato"
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                    atualizacoesMinimo++; // Conta cada vez que o 'ponteiro' do menor muda
                }
            }
            
            // Só realiza a troca física se o menor encontrado não for o que já estava na posição
            if (indiceMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = aux;
                trocas++;
            }
        }
        System.out.println("Selection Sort (" + cenario + "): " + trocas + " trocas e " + atualizacoesMinimo + " atualizações de menor valor.");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        
        // --- CENÁRIO A: ALEATÓRIO ---
        int[] aleatorioB = new int[100];
        int[] aleatorioS = new int[100];
        for(int i = 0; i < 100; i++) {
            int num = rand.nextInt(100) + 1;
            aleatorioB[i] = num;
            aleatorioS[i] = num;
        }
    
        // --- CENÁRIO B: DECRESCENTE (Pior caso) ---
        int[] decrescenteB = new int[100];
        int[] decrescenteS = new int[100];
        for(int i = 0; i < 100; i++) {
            decrescenteB[i] = 100 - i;
            decrescenteS[i] = 100 - i;
        }
        
        System.out.println("=== RESULTADOS DOS TESTES ===");
        rodarBubbleSort(aleatorioB, "Aleatório");
        rodarSelectionSort(aleatorioS, "Aleatório");
        
        System.out.println("\n-----------------------------");
        rodarBubbleSort(decrescenteB, "Decrescente");
        rodarSelectionSort(decrescenteS, "Decrescente");
    }
}
