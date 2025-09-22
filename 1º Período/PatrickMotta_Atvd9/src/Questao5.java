/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/15
*/

/*
5) Crie um jogo da velha 3x3 onde dois jogadores alternam entre "X" e "O". Verifique o vencedor ou
empate.
*/


import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3]; // Tabuleiro 3x3

        // --- Inicializar o tabuleiro com espaços vazios ---
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        char jogadorAtual = 'X'; // O 'X' sempre começa
        boolean jogoAtivo = true;
        int jogadas = 0; // Conta o número de jogadas para verificar empate

        System.out.println("--- Bem-vindo ao Jogo da Velha! ---");

        while (jogoAtivo) {
            // --- Exibir o tabuleiro ---
            System.out.println("\n-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println("\n-------------");
            }

            // --- Pedir e validar a jogada ---
            System.out.printf("Jogador %c, digite sua jogada (linha e coluna de 0 a 2):\n", jogadorAtual);
            int linha;
            int coluna;
            boolean jogadaValida = false;

            while (!jogadaValida) {
                System.out.print("Linha: ");
                linha = sc.nextInt();
                System.out.print("Coluna: ");
                coluna = sc.nextInt();

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                    tabuleiro[linha][coluna] = jogadorAtual; // Faz a jogada
                    jogadaValida = true;
                } else {
                    System.out.println("Jogada inválida! Tente novamente. (Verifique se a posição está vazia e nos limites)");
                }
            }
            jogadas++; // Incrementa o contador de jogadas após uma jogada válida

            // --- Verificar Vencedor ---
            boolean haVencedor = false;

            // Verificar linhas
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                    haVencedor = true;
                    break;
                }
            }
            // Verificar colunas (somente se não venceu por linha)
            if (!haVencedor) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual && tabuleiro[2][j] == jogadorAtual) {
                        haVencedor = true;
                        break;
                    }
                }
            }
            // Verificar diagonais (somente se não venceu por linha ou coluna)
            if (!haVencedor) {
                // Diagonal principal
                if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
                    haVencedor = true;
                }
                // Diagonal secundária
                else if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
                    haVencedor = true;
                }
            }

            if (haVencedor) {
                // --- Exibir o tabuleiro final e o vencedor ---
                System.out.println("\n-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tabuleiro[i][j] + " | ");
                    }
                    System.out.println("\n-------------");
                }
                System.out.printf("Parabéns! O jogador %c venceu!\n", jogadorAtual);
                jogoAtivo = false; // Encerra o jogo
            }
            // --- Verificar Empate (apenas se não houver vencedor) ---
            else if (jogadas == 9) { // Todas as 9 casas foram preenchidas
                // --- Exibir o tabuleiro final e o empate ---
                System.out.println("\n-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tabuleiro[i][j] + " | ");
                    }
                    System.out.println("\n-------------");
                }
                System.out.println("O jogo terminou em empate!");
                jogoAtivo = false; // Encerra o jogo
            }
            // --- Trocar o jogador se o jogo continua ---
            else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X'; // Alterna entre 'X' e 'O'
            }
        }

        sc.close(); // Fechar o Scanner
    }
}
