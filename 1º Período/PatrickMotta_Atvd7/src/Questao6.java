/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
06) Crie um vetor de 15 números inteiros e peça ao usuário para inserir um número. Verifique se o
número está presente no vetor e informe sua posição.
*/

import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {27,52,12,32,41,65,41,74,98,21,41,46,32,68,73};
        boolean encontrado = false;

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (num == vetor[i]) {
                System.out.println(num+" é um número que está presente no vetor na posição "+i);
                encontrado = true;
            }
        }

        if (!encontrado) {
                System.out.println("Este número não está presente no vetor");
        }

        sc.close();
    }
}
