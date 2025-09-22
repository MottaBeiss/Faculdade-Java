/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/15
*/

/*
6) Crie um jogo de campo minado, utilizando uma matriz de 5x5 onde:
0 = espaço vazio
-1 = bomba
O usuário digita coordenadas (linha, coluna) para revelar posições.
Se encontrar uma bomba, perde
*/

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 5; // Número de linhas do tabuleiro
        int colunas = 5; // Número de colunas do tabuleiro
        int numBombas = 5; // Quantidade de bombas no tabuleiro

        // Array para mapear números de linha para letras
        char[] mapaLinhas = {'A', 'B', 'C', 'D', 'E'};

        // Matriz "verdadeira" do jogo: -1 para bomba, 0 para espaço vazio
        int[][] tabuleiroReal = new int[linhas][colunas];

        // Matriz que o jogador vê: '#' para célula oculta, '0' para célula vazia revelada
        char[][] tabuleiroJogador = new char[linhas][colunas];

        // --- Inicializa as matrizes ---
        // 1. Preenche o tabuleiroReal com 0s (espaços vazios)
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                tabuleiroReal[i][j] = 0;
            }
        }

        // 2. Preenche o tabuleiroJogador com '#' (oculto)
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                tabuleiroJogador[i][j] = '#';
            }
        }

        // --- Coloca as bombas em posições fixas (para este exemplo simples) ---
        tabuleiroReal[0][0] = -1; // Bomba na linha 0 (A), coluna 0
        tabuleiroReal[1][3] = -1; // Bomba na linha 1 (B), coluna 3
        tabuleiroReal[2][1] = -1; // Bomba na linha 2 (C), coluna 1
        tabuleiroReal[3][4] = -1; // Bomba na linha 3 (D), coluna 4
        tabuleiroReal[4][2] = -1; // Bomba na linha 4 (E), coluna 2

        // Variáveis de controle do jogo
        boolean jogoAcabou = false; // Indica se o jogo terminou (por vitória ou derrota)
        boolean venceu = false;     // Indica se o jogador venceu
        int celulasVaziasReveladas = 0; // Conta quantas células sem bomba foram reveladas

        // Calcula o total de células que não são bombas (para a condição de vitória)
        int totalCelulasNaoBomba = (linhas * colunas) - numBombas;

        System.out.println("--- Bem-vindo ao Campo Minado! ---");
        System.out.println("Tente revelar todos os espaços vazios ('0') sem pisar em uma bomba ('-1').");
        System.out.println("Digite as coordenadas: Linha (A-E) e Coluna (0-4).");

        // --- Loop principal do jogo ---
        while (!jogoAcabou && !venceu) {
            // --- Exibir o tabuleiro atual para o jogador ---
            System.out.println("\n  0 1 2 3 4"); // Cabeçalho das colunas
            System.out.println("  ---------");
            for (int i = 0; i < linhas; i++) {
                System.out.print(mapaLinhas[i] + "|"); // Usa a letra da linha
                for (int j = 0; j < colunas; j++) {
                    System.out.print(tabuleiroJogador[i][j] + " "); // Exibe o que o jogador vê
                }
                System.out.println(); // Nova linha para a próxima fileira
            }
            System.out.println("  ---------\n");

            // --- Pedir a jogada do usuário ---
            System.out.print("Digite a linha (A-E): ");
            String linhaStr = sc.next().toUpperCase(); // Lê a letra e converte para maiúscula
            System.out.print("Digite a coluna (0-4): ");
            int coluna = sc.nextInt();

            int linha = -1; // Variável para armazenar o índice numérico da linha

            // --- Converter a letra da linha para um número ---
            if (linhaStr.length() == 1) { // Garante que apenas uma letra foi digitada
                char charLinha = linhaStr.charAt(0);
                if (charLinha >= 'A' && charLinha <= 'E') {
                    linha = charLinha - 'A'; // Converte 'A' para 0, 'B' para 1, etc.
                }
            }

            // --- Validação da entrada do usuário (agora com a lógica da letra) ---
            if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
                System.out.println("Coordenadas inválidas! Por favor, digite uma linha de A a E e uma coluna de 0 a " + (colunas - 1) + ".");
                continue; // Volta para o início do loop para pedir a entrada novamente
            }

            // --- Verificar se a posição já foi revelada ---
            if (tabuleiroJogador[linha][coluna] != '#') {
                System.out.println("Esta posição já foi revelada. Escolha outra.");
                continue; // Volta para o início do loop
            }

            // --- Processar a jogada ---
            if (tabuleiroReal[linha][coluna] == -1) { // O jogador pisou em uma bomba
                jogoAcabou = true; // Define o jogo como terminado
                System.out.println("BOOM! Você pisou em uma BOMBA (-1). Fim de jogo!");

                // --- Revelar o tabuleiro completo no fim do jogo (mostrando as bombas) ---
                System.out.println("\n--- FIM DE JOGO! Mapa Completo ---");
                System.out.println("  0 1 2 3 4");
                System.out.println("  ---------");
                for (int i = 0; i < linhas; i++) {
                    System.out.print(mapaLinhas[i] + "|"); // Usa a letra da linha
                    for (int j = 0; j < colunas; j++) {
                        if (tabuleiroReal[i][j] == -1) {
                            System.out.print("B "); // Mostra 'B' para as bombas
                        } else {
                            System.out.print("0 "); // Mostra '0' para espaços vazios
                        }
                    }
                    System.out.println();
                }
                System.out.println("  ---------");

            } else { // O jogador revelou um espaço vazio
                tabuleiroJogador[linha][coluna] = '0'; // Marca a célula como '0' revelada
                celulasVaziasReveladas++;       // Incrementa o contador de células vazias reveladas
                System.out.println("Espaço vazio ('0') revelado. Continue!");

                // --- Verificar condição de vitória ---
                if (celulasVaziasReveladas == totalCelulasNaoBomba) {
                    venceu = true; // Define que o jogador venceu
                    System.out.println("\nPARABÉNS! Você revelou todos os espaços vazios e VENCEU o jogo!");

                    // --- Exibir o tabuleiro final (mostrando as bombas) ---
                    System.out.println("\n--- Você VENCEU! Mapa Completo ---");
                    System.out.println("  0 1 2 3 4");
                    System.out.println("  ---------");
                    for (int i = 0; i < linhas; i++) {
                        System.out.print(mapaLinhas[i] + "|"); // Usa a letra da linha
                        for (int j = 0; j < colunas; j++) {
                            if (tabuleiroReal[i][j] == -1) {
                                System.out.print("B "); // Mostra 'B' para as bombas
                            } else {
                                System.out.print("0 "); // Mostra '0' para espaços vazios
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("  ---------");
                }
            }
        }

        sc.close(); // Fecha o Scanner para liberar recursos
        System.out.println("\nJogo Encerrado.");
    }
}