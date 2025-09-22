/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
Extra) Imagine que você está desenvolvendo um aplicativo de
gerenciamento dos valores da conta luz de uma
empresa que fornece energia elétrica fotovoltaica a 12
clientes, e precisa armazenar estes valores, mês a mês,
para que sejam consultados.
*/

import java.util.Scanner;
public class AtvdConta_de_Luz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = {"Daisy", "Gledson", "Vilma", "Fayer", "Fagner", "Alexandre", "Erick", "Jéssica", "Sarah", "Naiara", "Vinicius", "Tamara"};
        double[][] contas = new double[2][3];  // 12 clientes, 12 meses
        boolean encontrado = false;

        for (int i = 0; i < contas.length; i++) {
            for (int j = 0; j < contas[i].length; j++) {
                System.out.println("Digite o valor da conta de luz do(a) " + nome[i] + " para o mês " + (j + 1) + ": ");
                contas[i][j] = sc.nextDouble();
            }
        }
        sc.nextLine();

        System.out.println();

        while (!encontrado) {
            System.out.print("Digite o nome do cliente que deseja consultar: ");
            String busca = sc.nextLine();

            //for para consultar as contas do ano de um cliente
            for (int i = 0; i < nome.length; i++) {
                if (nome[i].equalsIgnoreCase(busca)) { // Compara o nome digitado (busca) com o nome no vetor nome[i]. O IgnoreCase permite ignorar se a pessoa digitou "Daisy", "daisy", ou "DAISY" (não diferencia maiúsculas e minúsculas).
                    System.out.println("\nContas de " + nome[i] + ":");
                    for (int j = 0; j < contas[i].length; j++) {
                        System.out.println("  Mês " + (j + 1) + ": R$ " + contas[i][j]);
                    }
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("\nCliente não encontrado! Tente novamente!");
            }
        }

        sc.close();
    }
}
