/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/24
 */

import java.util.Scanner;
public class Questao1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular o seu quadrado");

        int num = sc.nextInt();
        double quadrad = Math.pow(num, 2);

        System.out.println("O quadrado do número " + num + " é: " + quadrad);

        sc.close();
    }
}
