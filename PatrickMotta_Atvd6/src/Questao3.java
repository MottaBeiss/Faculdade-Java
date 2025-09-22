/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/17 */

/*
03) Elaborar um algoritmo que leia 5 valores inteiros.
O algoritmo não poderá aceitar o número zero.

Mostrar:
a) A média dos valores positivos.
b) A média dos valores negativos.

NÃO DIVIDIRÁS POR ZERO!!!!!
0/10 = 0 – POSSO PEGAR O ZERO E DIVIDIR POR QUALQUER NÚMERO
10/0 = ∞ NÃO POSSO – NUNCA DIVIDA QUALQUER NÚMERO POR ZERO
 */

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaNegativos = 0;
        int somaPositivos = 0;
        int positivos = 0;
        int negativos = 0;
        int num;

        for (int i = 1; i <= 5; i++ ) {

            do {
                System.out.print("Digite o " + i + "º número (diferente de zero): ");
                num = sc.nextInt();

                if (num >= 0) {
                    positivos++;
                    // Soma os positivos
                    somaPositivos += num;
                } else {
                    negativos++;
                    // Soma os negativos
                    somaNegativos += num;
                }
                if (num == 0){
                    System.out.println("Zero não é permitido. Tente novamente.");
                }
            } while (num == 0);
        }

        if (positivos > 0) {
            double mediaPositivos = somaPositivos / positivos;
            System.out.println("Média positivos: " + mediaPositivos);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }

        if (negativos > 0) {
            double mediaNegativos = somaNegativos / negativos;
            System.out.println("Média negativos: " + mediaNegativos);
        } else {
            System.out.println("Nenhum número negativo foi digitado.");
        }

        sc.close();
    }
}