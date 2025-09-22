/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/30
 */

import java.util.Scanner;
public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números inteiros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int soma = num1 + num2 + num3;
        int produto = num1 * num2 * num3;

        System.out.println("A soma dos números é "+soma);
        System.out.print("\n");
        System.out.println("O produto dos números é "+produto);

        sc.close();
    }
}
