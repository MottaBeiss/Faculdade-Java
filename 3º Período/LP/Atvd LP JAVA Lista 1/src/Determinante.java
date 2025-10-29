import java.util.Scanner;

public class Determinante {

    public static void main(String[] args) {
        // Cria a matriz 3x3 e o objeto Scanner para leitura
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Pede e armazena os 9 valores informados pelo usuário
        System.out.println("Por favor, insira os 9 valores inteiros para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostra a matriz que foi montada
        System.out.println("\nA matriz informada foi:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        // --- Início do Cálculo do Determinante com Raciocínio de Loop ---

        long somaPrincipais = 0;
        long somaSecundarias = 0;

        // O laço 'i' representa a coluna inicial de cada uma das 3 diagonais
        for (int i = 0; i < 3; i++) {
            
            // Calcula o produto de uma diagonal principal
            // O padrão das colunas é: i, i+1, i+2
            // O operador de módulo (%) faz o índice "dar a volta" (ex: 2+1=3 -> 3%3=0)
            long produtoPrincipal = (long)matriz[0][i % 3] *
                                      matriz[1][(i + 1) % 3] *
                                      matriz[2][(i + 2) % 3];
            somaPrincipais += produtoPrincipal;

            // Calcula o produto de uma diagonal secundária
            // O padrão das colunas é i, i-1, i-2
            // Usamos (+ 3) para garantir que o resultado do módulo não seja negativo
            long produtoSecundario = (long)matriz[0][i % 3] *
                                        matriz[1][(i - 1 + 3) % 3] *
                                        matriz[2][(i - 2 + 3) % 3];
            somaSecundarias += produtoSecundario;
        }

        // O determinante é a diferença entre as somas
        long determinante = somaPrincipais - somaSecundarias;
        
        // --- Fim do Cálculo ---

        // Mostra o resultado final na tela
        System.out.println("\nO determinante da matriz é: " + determinante);

        // Fecha o Scanner
        scanner.close();
    }
}