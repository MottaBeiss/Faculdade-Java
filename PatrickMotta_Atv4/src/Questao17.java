/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/30
 */

import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de três digitos");
        int a = sc.nextInt();
        int unidade = a % 10;
        int dezena = (a/10) % 10;
        int centena = a/100;

        System.out.printf("Este número na forma invertida é %d%d%d",unidade,dezena,centena);

        sc.close();
    }
}