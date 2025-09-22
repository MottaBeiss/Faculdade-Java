/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/26
 */

import java.util.Scanner;
public class Questao4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        int celsius = sc.nextInt();
        int fahrenheit = ((celsius * 9/5)+ 32);
        System.out.print(+celsius+ "ºC é equivalente a "+fahrenheit+ "ºF.");

        sc.close();

    }
}
