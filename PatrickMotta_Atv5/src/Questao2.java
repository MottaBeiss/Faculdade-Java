/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("OLÁ, vamos fazer um programa que receba dois números e mostre o maior.");
        System.out.println("Digite o primeiro número:");
        int a = sc.nextInt();
        System.out.println("Agora o segundo:");
        int b = sc.nextInt();
        if (a > b ){
            System.out.println(+a+" é o maior número");
        } else if (b > a){
            System.out.println(+b+" é o maior número");
        } else{
            System.out.println("Os dois números são iguais");
        }

        sc.close();
    }
}