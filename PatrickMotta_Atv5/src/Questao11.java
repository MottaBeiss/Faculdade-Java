/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/07
 */

import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double sal = sc.nextDouble();
        double ajust = 0;

        if (sal < 500.0) {
            ajust = sal * 0.15;
        } else if (sal >= 500.0 && sal <= 1000.0) {
            ajust = sal * 0.10;
        } else if (sal >1000) {
            ajust = sal * 0.05;
        }

        System.out.printf("Seu salário recebeu um aumento de R$ %.2f\n",ajust);
        System.out.printf("Salário ajustado R$ %.2f",(sal + ajust));

        sc.close();
    }
}
