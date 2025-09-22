/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/19 */

/*
10) Imagine uma brincadeira entre dois colegas, na qual um pensa um número e o outro deve fazer
chutes até acertar o número imaginado. Como dica, a cada tentativa é dito se o chute foi alto ou
foi baixo. Faça um algoritmo dentro deste conceito que leia o número imaginado e os chutes, ao
final mostre quantas tentativas foram necessárias para descobrir o número. */

import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int palpite, escolhido=52, c=0;

        while (true) {
            System.out.println("Será que você consegue adivinhar qual número estou pensando? ");
            palpite = sc.nextInt();

            if (palpite == escolhido) {
                break;
            } else if (palpite > escolhido) {
                System.out.println("VOCÊ ERROU! Ess número é MAIOR que o escolhido!");
                c++;
            } else {
                System.out.println("VOCÊ ERROU! Esse número é MENOR que o escolhido!");
                c++;
            }
        }

        System.out.println("PARABÉNS, você acertou!");
        System.out.println("Você acertou em "+c+" tentativas!");

        sc.close();
    }
}
