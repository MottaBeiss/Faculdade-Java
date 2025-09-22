/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/31
*/

/*
3) Faça um algoritmo utilizando vetores para que este realize a seguinte operação: o produto do
primeiro vetor pelo inverso do segundo é armazenado a partir do centro para as bordas; de modo
alternado, o vetor é de reais e possui 20 posições
*/


import java.util.Random;

public class Questao3 {
    public static void main(String[] args)  {
        Random rand = new Random();

        double[] num1 = new double[20], num2 = new double[num1.length], result = new double[num1.length];
        int[] guardaNum1 = new int[num1.length], guardaNum2 = new int[num1.length];

        int centroDireita = result.length / 2;
        int centroEsquerda = (result.length / 2) - 1;

        System.out.println("---VETORES GERADOS---");
        for (int i = 0; i < num1.length; i++) {
            num1[i] = rand.nextDouble(50);
            System.out.printf("índice [%d] do primeiro vetor: %.2f%n",i, num1[i]);
        }

        System.out.println();

        for (int i = 0; i < num1.length; i++) {
            num2[i] = rand.nextDouble(50);
            System.out.printf("índice [%d] do segundo vetor: %.2f%n",i, num2[i]);
        }

        for (int i = 0; i < num1.length; i++) {

            double produto = num1[i] * num2[num1.length - (i+1)];

           if (i % 2 == 0) {
               result[centroDireita] = produto;
               guardaNum1[centroDireita] = i;
               guardaNum2[centroDireita] = num2.length - (i+1);
               centroDireita++;
           } else {
               result[centroEsquerda] = produto;
               guardaNum1[centroEsquerda] = i;
               guardaNum2[centroEsquerda] = num1.length - (i+1);
               centroEsquerda--;
           }
        }

        System.out.println("\n---RESULTADO---");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("Produto do índice [%d]: %.2f (1º vetor índice [%d]) * %.2f (2º vetor índice [%d]) = %.2f%n",
                    i,
                    num1[guardaNum1[i]], guardaNum1[i], num2[guardaNum2[i]], guardaNum2[i], result[i]);
        }
    }
}