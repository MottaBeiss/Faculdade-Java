/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
08) Crie um vetor de caracteres com 10 posições preenchido pelo usuário. Em seguida, conte e mostre
quantas vogais (a, e, i, o, u) há no vetor.
*/

import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letra = new char [10];
        int vogais = 0;

        for (int i = 0; i < letra.length; i++) {
            System.out.print("Digite a "+(i+1)+ "º letra: ");
            letra[i] = sc.next().charAt(0);
            if (Character.toLowerCase(letra[i]) == 'a' ||
                    Character.toLowerCase(letra[i]) == 'e' ||
                    Character.toLowerCase(letra[i]) == 'i' ||
                    Character.toLowerCase(letra[i]) == 'o' ||
                    Character.toLowerCase(letra[i]) == 'u') {
                vogais++;
            }
        }

        System.out.println("Quantidade de vogais no vetor: " + vogais);

        sc.close();
    }
}
