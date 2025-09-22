/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/26
 */

import java.util.Scanner;
public class Questao2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do produto? ");
        double preco = sc.nextDouble();

        System.out.print("Informe a quantidade deste produto: ");
        int quant = sc.nextInt();
        double preco_total = preco * quant;
        System.out.println("O preço total do produto é: "+preco_total);

        sc.close();
    }
}
