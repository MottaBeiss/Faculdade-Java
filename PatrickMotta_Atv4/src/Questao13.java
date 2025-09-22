/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/30
 */

import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite cinco números: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        double num4 = sc.nextInt();
        double num5 = sc.nextInt();
        double soma = num1 + num2 + num3 + num4 + num5;
        double media = soma/5;

        System.out.println("O valor da soma dos valores digitados é "+soma);
        System.out.println("A média é "+media);

        sc.close();
    }
}