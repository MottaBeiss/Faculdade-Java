/* 20. Implemente uma função recursiva que receba um vetor de inteiros e retorne o maior valor 
contido nele. */

 import java.util.Random;

public class Ex20 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int[] vet = new int [5];

        System.out.print("\nVetor: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = gerador.nextInt(30);
            System.out.print(vet[i] + " ");
        }
        
        System.out.printf("\nMaior número do vetor: %d", buscarMaior(vet, 0));
        System.out.println("\n");
    }

    
     /* Encontra o maior elemento de um vetor recursivamente, sem passar o 'maior'
     * encontrado como argumento. A função retorna o maior do subvetor.
     * @param vet O vetor de inteiros.
     * @param i O índice atual.
     * @return O maior elemento do subvetor que começa em 'i'.*/
     
    public static int buscarMaior (int[] vet, int i) {

        // 1. CASO BASE (Parada)
        // Se o índice chegou ao ÚLTIMO elemento (length - 1), 
        // ele é o maior do subvetor restante.
        if (i == vet.length - 1) {
            return vet[i];
        } 
        
        // 2. PASSO RECURSIVO
        // 'maiorDoResto' guarda o maior valor encontrado do índice i+1 até o final.
        int maiorDoResto = buscarMaior(vet, i + 1);

        // O resultado final é o maior entre o elemento atual (vet[i]) 
        // e o maior valor que veio do resto da recursão.
        if (vet[i] > maiorDoResto) {
            return vet[i];
        } else {
            return maiorDoResto;
        }
        
    }
}

