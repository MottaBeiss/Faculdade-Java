/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/30
 */

import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite cinco letras: ");
        char letra1 = sc.next().charAt(0);
        char letra2 = sc.next().charAt(0);
        char letra3 = sc.next().charAt(0);
        char letra4 = sc.next().charAt(0);
        char letra5 = sc.next().charAt(0);

        System.out.println(letra1);
        System.out.println(letra2);
        System.out.println(letra3);
        System.out.println(letra4);
        System.out.println(letra5);

        System.out.printf("Essas são as letras digitadas %c,%c,%c,%c,%c",letra1, letra2, letra3, letra4, letra5);

        sc.close();
    }
}