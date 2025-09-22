/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
09) Crie um vetor de 8 letras (char[]), preencha-o com caracteres, e depois exiba-o na ordem inversa.
*/

import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = new char[8];

        for (int i = 0; i < letras.length;i++) {
            System.out.print("Digite a "+(i+1)+"º letra: ");
            letras[i] = sc.next().charAt(0);
        }

        System.out.print("Letras na ordem inversa: ");
        for (int i = letras.length - 1; i >= 0; i--) {
            System.out.print(letras[i] + " ");
        }
    }
}
