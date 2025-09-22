/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/30
 */

import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double resto = num1 % num2;

        System.out.println("Estes são os seus números "+num1+", "+num2);
        System.out.println("O resto da divisão é "+resto);

        sc.close();
    }
}