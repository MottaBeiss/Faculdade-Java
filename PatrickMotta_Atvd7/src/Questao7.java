/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
07) Crie um vetor de caracteres (char[]) com 6 posições e preencha-o com letras aleatórias. Depois,
exiba o conteúdo do vetor.
*/

import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = new char[6];

        for (int i = 0; i < letras.length;i++) {
            System.out.print("Digite a "+(i+1)+"º letra: ");
            letras[i] = sc.next().charAt(0);
        }

        System.out.print("\nLetras: ");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " ");
        }

        sc.close();
    }
}
