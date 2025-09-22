/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Arrays;
import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4;

        while (true) {
            System.out.print("Digite o primeiro número: ");
            n1 = sc.nextInt();

            System.out.print("Digite o segundo número (maior que o primeiro): ");
            n2 = sc.nextInt();

            System.out.print("Digite o terceiro número (maior que o segundo): ");
            n3 = sc.nextInt();

            if (n1 < n2 && n2 < n3) {
                System.out.println("Valores em ordem crescente aceitos: " + n1 + ", " + n2 + ", " + n3);
                break;
            } else {
                System.out.println("Erro! Os números devem estar em ordem crescente. Tente novamente.\n");
            }
        }
        System.out.println("Digite um quarto número (Pode estar fora de ordem)");
        n4 = sc.nextInt();

        int[] numeros = {n1, n2, n3, n4};

        Arrays.sort(numeros);

        System.out.println("\nOs quatro números em ordem decrescente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}
