/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/29
 */

import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é a sua idade? ");
        int idade = sc.nextInt();
        System.out.print("Me fale quanto você tem de altura ");
        double altura = sc.nextDouble();
        System.out.printf("LEGAL, você tem %d anos de idade e %.2f de altura",idade,altura);

        sc.close();
    }
}
