/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/30
 */

import java.util.Scanner;
public class Questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quais as notas do aluno?");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int media = (a + b + c) /3;

        System.out.println("A média das notas é igual à "+media);

        sc.close();

    }
}