/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/19 */

/*
15) Faça um algoritmo que receba idade de X pessoas. A digitação se encerra quando o usuário digitar
-1 para a idade.
Calcule e imprima:
Total de pessoas na faixa etária de 0 a 12 anos.
Total de pessoas na faixa etária de 13 a 21 anos.
Total de pessoas na faixa etária de 22 a 60 anos.
Total de pessoas na faixa etária acima de 60 anos. */

import java.util.Scanner;
public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, faixaCrianca=0, faixaJovem=0, faixaAdulto=0, faixaIdoso=0;

        do {
            System.out.println("Digite uma idade: \n(Para encerrar o programa digite um número NEGATIVO.)");
            idade = sc.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade<=12) { //de 0 a 12
                faixaCrianca++;
            } else if (idade<=21) { //de 13 a 21
                faixaJovem++;
            } else if (idade<=60) { //de 22 a 60
                faixaAdulto++;
            } else { //acima de 60
                faixaIdoso++;
            }

        } while (true);

        System.out.println("\nRESULTADOS:");
        System.out.println("Total de pessoas com idade entre 0 a 12 anos: " +faixaCrianca);
        System.out.println("Total de pessoas com idade entre 13 a 21 anos: " +faixaJovem);
        System.out.println("Total de pessoas com idade entre 22 a 60 anos: " +faixaAdulto);
        System.out.println("Total de pessoas com idade acima de 60 anos: " +faixaIdoso);

    }
}
