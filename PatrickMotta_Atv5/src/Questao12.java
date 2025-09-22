/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/07
 */

import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Será que você tem idade o suficiente para votar.");
        System.out.print("Qual é a sua idade? ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Seu voto é facultativo");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Você é obrigado a votar");
        }

        sc.close();
    }
}
