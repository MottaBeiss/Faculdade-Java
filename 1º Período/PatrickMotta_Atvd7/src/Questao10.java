/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
10) Crie um vetor de 5 palavras (String[]) e exiba cada uma separadamente.
*/

import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palavra = new String[5];

        for (int i = 0; i < palavra.length;i++) {
            System.out.print("Digite a "+(i+1)+"º letra: ");
            palavra[i] = sc.nextLine();

        }


        for (int i = 0; i < palavra.length; i++) {
            System.out.println(palavra[i]);
        }
    }
}
