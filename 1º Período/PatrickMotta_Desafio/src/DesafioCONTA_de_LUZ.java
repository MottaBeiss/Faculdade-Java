/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/08
*/

/*
1) Faça um aplicativo em Java que faça o gerenciamento dos valores da conta luz de uma empresa que
fornece energia elétrica fotovoltaica a 20 clientes, e precisa armazenar a média do consumo de
energia de 12 meses de cada um dos clientes para que sejam consultados.
Requisitos do programa.

➢ O programa deverá receber o valor da média de consumo dos últimos doze meses de cada
cliente.
• A média do consumo de cada cliente deverá ser armazenada em um vetor de 20 posições.
• O nome de cada cliente deverá ser armazenada em um vetor de 20 posições.
• O código de cada cliente deverá ser armazenada em um vetor de 20 posições.
• Um vetor de 20 posições devera ser construído para armazenar o valor da média de
consumo em R$; O programa deverá ter uma variável chamada tarifa, e o valor do KW
será lida por esta variável.

➢ Deverão ser habilitadas e mostradas consultas por nomes ou por código. Ao ser solicitada
consulta deverá apresentar o nome do cliente, seu código, a média do consumo de energia e
a média do valor pago.
➢ O programa deverá mostrar uma tabela contendo o nome de cada cliente, seu código, a média
de consumo e o valor médio de consumo.
*/

import java.util.Scanner;
public class DesafioCONTA_de_LUZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMeses = 12;
        double tarifa = 0.90;

        int[] codCliente = new int[20];
        String[] clientes = new String[codCliente.length];
        double[] mediascomsumoClientes = new double[codCliente.length];
        double[] valorMediasdeComsumoClientes = new double[codCliente.length];

        System.out.printf("%nInsira o nome de %d clientes, e o consumo de%n" +
                "energia de %d meses de cada um deles:%n%n", clientes.length, numMeses);

        for (int i = 0; i < clientes.length; i++) {
            System.out.printf("%dº Cliente: ", i + 1);
            clientes[i] = sc.nextLine();
            codCliente[i] = i + 1;
            double somaConsumo = 0;

            for (int j = 0; j < numMeses; j++) {
                System.out.printf("%dº Mês: ", j + 1);
                double consumo = sc.nextDouble();
                somaConsumo += consumo;
            }
            sc.nextLine();
            double mediaConsumo = somaConsumo / numMeses;
            mediascomsumoClientes[i] = mediaConsumo;

            double valorMediaComsumo = mediaConsumo * tarifa;
            valorMediasdeComsumoClientes[i] = valorMediaComsumo;


            System.out.println();
        }

            System.out.println("Insira o código ou o nome de um cliente para consultar (Digite 'sair' para encerrar):\n");

            boolean clienteEncontrado = false;
            int indiceEncontrado = -1;

            if (sc.hasNextInt()) {
                int numero = sc.nextInt();

                for (int i = 0; i < codCliente.length; i++) {
                    if (codCliente[i] == numero) {
                        indiceEncontrado = i;
                        clienteEncontrado = true;
                        break;
                    }
                }
            } else {
                String cliente = sc.nextLine();

                for (int i = 0; i < codCliente.length; i++) {
                    if (cliente.equalsIgnoreCase(clientes[i])) {
                        indiceEncontrado = i;
                        clienteEncontrado = true;
                        break;
                    }
                }
            }

            if (clienteEncontrado) {
                System.out.println("\n--- DADOS DO CLIENTE ---");
                System.out.printf("Nome: %s%nCódigo: %d%nMédia de consumo: %.2f KWh%nValor médio pago: R$ %.2f",
                        clientes[indiceEncontrado], codCliente[indiceEncontrado], mediascomsumoClientes[indiceEncontrado], valorMediasdeComsumoClientes[indiceEncontrado]);
            } else {
                System.out.println("\nCliente não encontrado. Verifique o código ou nome digitado.");
            }


        System.out.println("\n\n---------------- DADOS DOS CLIENTES ------------------");
        System.out.println("| Cod | Nome | Média de Consumo | Média de Valor Pago |");
        for (int i = 0; i < codCliente.length; i++) {
            System.out.printf("|  %d  |  %s  |      %.2f KWh  |       R$ %.2f    |\n",
                    codCliente[i], clientes[i], mediascomsumoClientes[i], valorMediasdeComsumoClientes[i]);
        }

        sc.close();
    }
}