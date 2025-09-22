/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/06/01
*/

/*
10) Implemente uma função que receba um vetor de strings e uma string de busca, e retorne quantos
vezes a string de busca aparece no vetor (utilize busca linear).
*/

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palavras = new String[15];

        System.out.println("Digite 15 palavras aleatórias:");
        for (int i = 0; i < palavras.length;i++) {
            System.out.print(i+1+ "º palavra: ");
            palavras[i] = sc.nextLine().toUpperCase();
        }

        System.out.println();

        System.out.println("Vamos ver se alguma das palavras digitadas se repetem!");
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        int quant = 0;

        for (int i = 0; i < palavras.length; i++) {
            if (palavra.equalsIgnoreCase(palavras[i])) {
                quant++;
            }
        }

        if (quant > 0) {
            System.out.println("\nA palavra " + palavra + " aparece " + quant + " vezes no vetor.");
        } else {
            System.out.println("\nA palavra " + palavra + " não aparece no vetor.");
        }

        sc.close();
    }
}
