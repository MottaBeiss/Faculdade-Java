/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/19 */

/*
11) Faça um algoritmo que permita fazer um levantamento do estoque de vinhos de uma adega,
tendo como dados de entrada tipos de vinho, sendo: “T” para tinto, “B” para branco e “R” para
rosê. Especifique a porcentagem de cada tipo sobre o total geral de vinhos; a quantidade de
vinhos é desconhecida, utilize como finalizador “F” de fim.
 */

import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipoVinho;
        int quantVinho, tinto=0, branco=0, rose=0;

        do {
            System.out.println("Escolha o tipo do vinho:\n[T] para Vinho Tinto\n[B] para Vinho Branco\n[R] para Vinho Rosê\n[F] para sair");
            tipoVinho = sc.nextLine();

            while (!tipoVinho.equalsIgnoreCase("T") && !tipoVinho.equalsIgnoreCase("B") && !tipoVinho.equalsIgnoreCase("R") && !tipoVinho.equalsIgnoreCase("F")) {
                System.out.println("O código informado é INVALIDO. Tente novamente. ");
                tipoVinho = sc.nextLine();
            }

            if (tipoVinho.equalsIgnoreCase("F")) {
                break;
            }

            System.out.println("Digite a quantidade de vinhos do estoque: ");
            quantVinho = sc.nextInt();

            if (tipoVinho.equalsIgnoreCase("T")) {
                tinto += quantVinho;
            } else if (tipoVinho.equalsIgnoreCase("B")) {
                branco += quantVinho;
            } else if (tipoVinho.equalsIgnoreCase("R")) {
                rose += quantVinho;
            }

        } while (true);

        int totalVinhos = tinto + branco + rose;

        System.out.println("\nEstoque de Vinhos:");
        System.out.println("- Vinhos Tinto: " +tinto+ " (" +((tinto*100)/totalVinhos)+"%)");
        System.out.println("- Vinhos Branco: " +branco+ " (" +((branco*100)/totalVinhos)+"%)");
        System.out.println("- Vinhos Rosê: " +rose+ " (" +((rose*100)/totalVinhos)+"%)");

        sc.close();
    }
}
