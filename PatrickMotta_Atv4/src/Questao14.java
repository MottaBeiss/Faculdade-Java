/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/30
 */

import java.util.Scanner;
public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a letra R e a letra A ");
        char letra1 = sc.next().charAt(0);
        char letra2 = sc.next().charAt(0);
        System.out.printf("%c%c%c%c%c",letra2,letra1,letra2,letra1,letra2);

        sc.close();
    }
}