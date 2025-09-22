/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/01
*/

/*
9) Crie um vetor de 15 números inteiros e preencha-o automaticamente com valores aleatórios
entre -10 e 10. Imprima o vetor resultante.
*/


import java.util.Random;

public class Questao9 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] vetor = new int[15];

        System.out.println("\n--VETORES GERADOS--");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(-10,10);
            System.out.print(vetor[i] + ", ");
        }

        System.out.println();
    }
}
