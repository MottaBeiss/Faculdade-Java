/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números que irei colocalos em ordem crescente");
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        System.out.println("Números em ordem crescente:");

        if (a <= b && b <= c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b <= a && a <= c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b <= c && c <= a) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (c <= a && a <= b) {
            System.out.println(c + ", " + a + ", " + b);
        } else {
            System.out.println(c + ", " + b + ", " + a);
        }

        sc.close();
    }
}