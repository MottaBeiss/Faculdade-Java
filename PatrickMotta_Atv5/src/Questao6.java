/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vou descobrir se o número digitado é par ou ímpar");
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        if (n1 % 2 == 0 ) {
            System.out.printf("O número %d é par",n1);
        } else {
            System.out.printf("O número %d é impar",n1);
        }
        sc.close();
    }
}
