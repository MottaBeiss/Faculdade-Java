/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número que vou descobrir se é um número primo ou não:");
        int n1 = sc.nextInt();

        boolean primo = true;

        if (n1 <=1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n1); i++) {
                if (n1 % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
            if (primo) {
                System.out.printf("%d é um número primo", n1);
            } else {
            System.out.printf("%d não é um número primo",n1);
            }
        sc.close();
    }
}
