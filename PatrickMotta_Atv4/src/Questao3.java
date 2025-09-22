/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/26
 */

import java.util.Scanner;
public class Questao3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base maior, base menor e a altura do trapézio para descobrir a sua área:");
        double baseMaior = sc.nextDouble();
        double baseMenor = sc.nextDouble();
        double altura = sc.nextDouble();
        double area = ((baseMaior + baseMenor) * altura)/2;

        System.out.println("Àrea é = "+area);

        sc.close();
    }
}
