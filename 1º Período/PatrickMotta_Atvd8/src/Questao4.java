/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/31
*/

/*
4) Faça um algoritmo utilizando vetores para que este realize a seguinte operação: o produto do
primeiro vetor pelo inverso do segundo é armazenado a partir das bordas para o centro; de modo
alternado, o vetor é de reais e possui 20 posições
*/

import java.util.Random;
public class Questao4 {
    public static void main(String[] args) {
        Random rand = new Random();

        double[] vetor1 = new double[20], vetor2 = new double[vetor1.length], result = new double[vetor1.length];
        int[] guardaVetor1 = new int[vetor1.length], guardaVetor2 = new int[vetor1.length];

        int bordaDireita = result.length - 1;
        int bordaEsquerda = 0;

        System.out.println("---VETORES GERADOS---");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = rand.nextDouble(40);
            System.out.printf("índice [%d] do primeiro vetor: %.2f%n",i, vetor1[i]);
        }

        System.out.println();

        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = rand.nextDouble(40);
            System.out.printf("índice [%d] do segundo vetor: %.2f%n",i, vetor2[i]);
        }

        for (int i = 0; i < vetor1.length; i++) {

            double produto = vetor1[i] * vetor2[vetor1.length - (i+1)];

            if (i % 2 == 0) {
                result[bordaEsquerda] = produto;
                guardaVetor1[bordaEsquerda] = i;
                guardaVetor2[bordaEsquerda] =  vetor1.length - (i+1);
                bordaEsquerda++;
            } else {
                result[bordaDireita] = produto;
                guardaVetor1[bordaDireita] = i;
                guardaVetor2[bordaDireita] = vetor1.length - (i+1);
                bordaDireita--;
            }

        }

        System.out.println("\n---RESULTADO---");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("Produto do índice [%d]: %.2f (1º vetor índice [%d]) * %.2f (2º vetor índice [%d]) = %.2f%n",
                    i, vetor1[guardaVetor1[i]], guardaVetor1[i], vetor2[guardaVetor2[i]], guardaVetor2[i], result[i]);
        }

    }
}