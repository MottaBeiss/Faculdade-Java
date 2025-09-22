/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/15
*/

/*
4) Você está construindo um aplicativo de previsão do tempo. Para simplificar, registre a temperatura
máxima diária de uma cidade durante uma semana (7 dias) em 3 diferentes bairros.
Tarefa:
Crie uma matriz de double 7x3 (double[][]) para armazenar as temperaturas máximas.
Preencha a matriz com temperaturas fictícias para cada dia e bairro.
Calcule e exiba a temperatura média da semana para cada bairro.
Encontre e exiba o dia e o bairro com a temperatura mais alta registrada na semana
*/

import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] temperaturas = new double[3][3];

        System.out.println("--- Previsão do Tempo: Registro de Temperaturas ---");

        // Preenche a matriz com temperaturas inseridas pelo usuário
        System.out.println("\nPor favor, digite a temperatura máxima para cada dia e bairro:");
        for (int i = 0; i < temperaturas.length; i++) { // Loop para os dias
            System.out.printf("\nDia %d:\n", i + 1); // Exibe o número do dia (começando do 1)
            for (int j = 0; j < temperaturas[i].length; j++) { // Loop para os bairros
                System.out.printf("  Bairro %d: ", j + 1); // Exibe o número do bairro (começando do 1)
                temperaturas[i][j] = sc.nextDouble(); // Lê a temperatura do usuário
            }
        }

        // Imprime a matriz preenchida para verificação
        System.out.println("\n--- Temperaturas Registradas (Dia x Bairro) ---");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Dia %d: ", i + 1);
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.printf("%.1f°C ", temperaturas[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------\n");

        // --- Calcula e exibe a temperatura média da semana para cada bairro ---
        System.out.println("--- Temperaturas Médias por Bairro ---");
        for (int j = 0; j < temperaturas[0].length; j++) { // Percorre os bairros (colunas)
            double somaTemperaturasBairro = 0;
            for (int i = 0; i < temperaturas.length; i++) { // Percorre os dias (linhas)
                somaTemperaturasBairro += temperaturas[i][j];
            }
            double mediaBairro = somaTemperaturasBairro / temperaturas.length;
            System.out.printf("Bairro %d: %.2f°C\n", j + 1, mediaBairro);
        }
        System.out.println("------------------------------------\n");

        // --- Encontra a temperatura mais alta e o dia/bairro correspondente ---
        double maiorTemperatura = temperaturas[0][0]; // Inicializa com a primeira temperatura
        int diaMaiorTemp = 0;
        int bairroMaiorTemp = 0;

        for (int i = 0; i < temperaturas.length; i++) { // Percorre os dias
            for (int j = 0; j < temperaturas[i].length; j++) { // Percorre os bairros
                if (temperaturas[i][j] > maiorTemperatura) {
                    maiorTemperatura = temperaturas[i][j];
                    diaMaiorTemp = i;
                    bairroMaiorTemp = j;
                }
            }
        }

        System.out.println("--- Maior Temperatura Registrada ---");
        System.out.printf("Temperatura: %.1f°C\n", maiorTemperatura);
        System.out.printf("Dia: %d\n", diaMaiorTemp + 1); // +1 para mostrar Dia 1, Dia 2, etc.
        System.out.printf("Bairro: %d\n", bairroMaiorTemp + 1); // +1 para mostrar Bairro 1, Bairro 2, etc.
        System.out.println("------------------------------------\n");

        sc.close();
    }
}