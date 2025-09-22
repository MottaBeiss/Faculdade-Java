/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/30
 */

import java.util.Scanner;
public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a altura e a base do triângulo?");
        int altura = sc.nextInt();
        int base = sc.nextInt();
        int area = (base * altura) /2;
        System.out.println("A área do triângulo é de "+area);

        sc.close();
    }
}