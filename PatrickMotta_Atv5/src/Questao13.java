/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/12
 */

import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros, se forem iguais será somado, caso contrário eu irei multiplicalos");
        System.out.print("Informe o primeiro: ");
        int a = sc.nextInt();
        System.out.print("Agora o segundo: ");
        int b = sc.nextInt();
        int c = 0;

        if (a == b) {
           c = a + b;
        } else {
            c = a * b;
        }

        System.out.printf("Os valores inseridos foram %d e %d e o resultado foi %d",a,b,c);
    }
}
