/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/29
 */

import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.print("Qual é o seu nome? ");
        String nome = sc.next();
        System.out.printf("Prazer %s, que legal você ter %d anos de idade", nome, idade);

        sc.close();
    }
}