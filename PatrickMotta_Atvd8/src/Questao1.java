/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/31
*/

/*
1) Escreva um algoritmo que leia um array de 5 elementos inteiros. Solicite ao usuário a digitação de
um número e verifique se o mesmo se encontra no vetor. Se sim, avise o usuário que o número foi
encontrado e sua posição, caso contrário informe que o número não se encontra no vetor.
*/

import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {10,26,34,9,18};
        boolean encontrado = false;

        System.out.print("\nDigite um número: ");
        int num = sc.nextInt();

            for (int i = 0; i < vetor.length;i++) {
                if (num == vetor[i]) {
                    System.out.println("\nNúmero encontrado no vetor "+ i);
                    encontrado = true;
                    break;
                }
            }

        if (!encontrado) {
            System.out.println("\nNUMERO NÃO ENCONTRADO NO VETOR");
        }

        sc.close();
    }
}