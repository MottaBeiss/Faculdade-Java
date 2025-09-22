/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/18 */

/*
07) Faça um algoritmo que leia um conjunto de dados contendo altura e sexo (“M” para masculino e
“F” para feminino) de 50 pessoas e, depois, calcule e escreva:
• A maior e a menor altura do grupo
• A média de altura das mulheres
• O Número de homens e a diferença porcentual entre eles e as mulheres. */


import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int M = 0, F = 0;
        double totalAlturaF = 0;
        double maior = 0,  menor = 25;

        while (i < 50) {
            System.out.println("Informe o sexo da "+(i+1)+"º pessoa (M para masculino e F para feminino):");
            char sexo = sc.next().toUpperCase().charAt(0);

            if (sexo == 'M' || sexo == 'F'){
                System.out.print("Altura: ");
                double altura = sc.nextDouble();

                if (altura > maior) {
                    maior = altura;
                }

                if (altura < menor) {
                    menor = altura;
                }

                switch (sexo) {
                    case 'M': M++; break;
                    case 'F': F++; totalAlturaF += altura; break;
                }

                i++;
            } else {
                System.out.println("Sexo inválido, tente novamente.");
            }
        }

        double diferencaPercentual = Math.abs (M * 100.0 / i);

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Maior altura: "+maior);
        System.out.println("Menor altura: "+menor);
        System.out.printf("Média de altura das mulheres: %.2f%n",totalAlturaF / F);
        System.out.printf("Total de Homens: %d. Com um percentual de %.2f%%\n",M, diferencaPercentual);

        sc.close();
    }
}