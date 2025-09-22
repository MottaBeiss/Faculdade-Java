/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/15
*/

/*
Criar um programa que registre o número de crianças vacinadas e o total de crianças elegíveis para vacinação em 10 postos de saúde.
Calcula a taxa de cobertura vacinal para cada posto e identifica os postos com cobertura abaixo de 90%.
Elementos Obrigatórios: int (vacinadas, elegíveis), double (taxa de cobertura), String (nome do posto), if-else, for,
Matriz bidimensional.
Com o nome dos postos e com a taxa de cobertura vacinal.
*/

import java.util.Random;
import java.util.Scanner;

public class Atvd_Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] postos = new String[10];
        double[] taxaDeCobertura = new double[postos.length];

        double[][] criancas = new double[postos.length][2];

        for (int i = 0; i < postos.length; i++) {
            System.out.printf("\nDigite o nome do %dº posto: ",i+1);
            postos[i] = sc.nextLine();
            criancas[i][0] = rand.nextInt(100, 150);
            criancas[i][1] = rand.nextInt(1, 100);
            System.out.println("Crianças elegíveis: "+criancas[i][0]);
            System.out.println("Crianças Vacinadas: "+criancas[i][1]);
            taxaDeCobertura[i] = (criancas[i][1] / criancas[i][0]) * 100;
        }


        for (int i = 0; i < postos.length; i++) {
            System.out.printf("Posto: %s \nTaxa de cobertura: %.2f%%\n",postos[i],taxaDeCobertura[i]);
        }

        System.out.println("\nPostos com cobertura abaixo de 90%:");
        for (int i = 0; i < postos.length; i++) {
            if (taxaDeCobertura[i] < 90) {
                System.out.printf("Posto: %s \nTaxa de cobertura: %.2f%%\n",postos[i],taxaDeCobertura[i]);
            }
        }

        sc.close();
    }
}