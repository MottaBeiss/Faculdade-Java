/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/15
*/

/*
3) Um cinema tem 3 salas, e cada sala tem 5 fileiras com 10 assentos cada. Você precisa de um sistema
para registrar se um assento está ocupado ou livre.
Crie uma matriz tridimensional de caracteres char[][][] (char[3][5][10]) para representar as salas,
fileiras e assentos. Use 'L' para livre e 'O' para ocupado.
Inicialize todos os assentos como 'L' (livre).
Simule a ocupação de alguns assentos (por exemplo, sala 0, fileira 2, assento 5; sala 1, fileira 0,
assento 1; etc., escolham vocês!).
Exiba o mapa de uma sala específica (escolha uma sala) no console, mostrando 'L' ou 'O' para cada
assento.
Dica: Para matrizes tridimensionais, você precisará de 3 loops aninhados para percorrer todos os
elementos.
*/

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][][] salas = new char[3][5][10];

        for (int i = 0; i < salas.length; i++) {
            for (int j = 0; j < salas[i].length; j++) {
                for (int k = 0; k < salas[i][j].length; k++) {
                    salas[i][j][k] = 'L';
                }
            }
        }

        System.out.println("--- Sistema de Reserva de Assentos do Cinema ---");

        System.out.println("\nSimulando a ocupação de alguns assentos:");

        salas[0][2][5] = 'O';
        System.out.println("Assento (Sala 0, Fileira 2, Assento 5) ocupado.");


        salas[1][0][1] = 'O';
        System.out.println("Assento (Sala 1, Fileira 0, Assento 1) ocupado.");


        salas[2][4][9] = 'O';
        System.out.println("Assento (Sala 2, Fileira 4, Assento 9) ocupado.\n");

        System.out.println("Mapa das salas e seus assentos disponíveis");
        for (int i = 0; i < salas.length; i++) {
            for (int j = 0; j < salas[i].length; j++) {
                for (int k = 0; k < salas[i][j].length; k++) {
                    System.out.print(salas[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        boolean continuarReservando = true;

        while (continuarReservando) {
            System.out.println("Qual assento deseja reservar?");
            System.out.print("Digite de 0 a 2 para escolher uma sala: ");
            int sala = sc.nextInt();
            System.out.print("De 0 a 4 para fileira: ");
            int fileira = sc.nextInt();
            System.out.print("De 0 a 9 para o assento: ");
            int assento = sc.nextInt();

            if (sala >= 0 && sala < 3 &&
                    fileira >= 0 && fileira < 5 &&
                    assento >= 0 && assento < 10) {

                if (salas[sala][fileira][assento] == 'L') {
                    salas[sala][fileira][assento] = 'O';
                    System.out.printf("Assento (Sala %d, Fileira %d, Assento %d) AGORA OCUPADO.\n\n",
                            sala, fileira, assento);
                } else {
                    System.out.println("Este assento já está ocupado. Tente outro.");
                }
            } else {
                System.out.println("Valores de entrada inválidos. Por favor, digite números dentro dos intervalos.");
            }

            int salaParaExibir = sala;

            System.out.printf("--- Mapa da Sala %d ---\n", salaParaExibir);
            for (int j = 0; j < salas[salaParaExibir].length; j++) {
                System.out.printf("Fileira %d: ", j);
                for (int k = 0; k < salas[salaParaExibir][j].length; k++) {
                    System.out.print(salas[salaParaExibir][j][k] + " ");
                }
                System.out.println();
            }

            System.out.print("\nDeseja reservar outro assento? (sim/não): ");
            String resposta = sc.next().toLowerCase(); // Converte para minúsculas para facilitar a comparação

            if (resposta.equals("nao") || resposta.equals("não")) {
                continuarReservando = false; // Sai do loop
                System.out.println("Saindo do sistema de reservas. Obrigado!");
            }
        }

        sc.close();
    }
}