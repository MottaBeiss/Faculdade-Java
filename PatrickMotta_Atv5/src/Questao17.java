/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/12
 */

import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe qual é o seu salário: ");
        double sal = sc.nextDouble();

        double des = 0;

        if (sal <= 1100) {
            des = sal * 0.075;
            System.out.println("O seu salario vai ser de "+(sal-des)+". E o valor do desconto será de "+des);
        } else if (sal >= 1100.01 && sal <= 2203.48) {
            des = sal * 0.09;
            System.out.println("O seu salario vai ser de "+(sal-des)+". E o valor do desconto será de "+des);
        } else if (sal >= 2203.49 && sal <= 3305.22) {
            des = sal * 0.12;
            System.out.println("O seu salario vai ser de "+(sal-des)+". E o valor do desconto será de "+des);
        } else if (sal >= 3305.23 && sal <= 6433.57) {
            des = sal * 0.14;
            System.out.println("O seu salario vai ser de "+(sal-des)+". E o valor do desconto será de "+des);
        } else {
            sal = 6433.57;
            des = sal * 0.14;
            System.out.printf("O seu salario vai ser de %.2f E o valor do desconto será de %.2f",(sal-des),des);
        }

        sc.close();
    }
}
