/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número que vou dizer se ele é positivo ou negativo: ");
        int n1 = sc.nextInt();

        if (n1 >= 0 ) {
            System.out.printf("%d é um número positivo",n1);
        } else {
            System.out.printf("%d é um número negativo",n1);
        }

        sc.close();
    }
}
