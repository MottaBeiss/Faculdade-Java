/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o código do produto comprado: ");
        int cod = sc.nextInt();
        double preco = 0;

        if (cod >= 1 && cod <= 10) {
            preco = 10;
        } else if (cod >= 11 && cod <= 20) {
            preco = 15;
        } else if (cod >= 21 && cod <= 30) {
            preco = 20;
        } else if (cod >= 31 && cod <= 40) {
            preco = 30;
        } else {
            System.out.println("Código inválido, digite um código de 1 a 40");
            System.exit(0);
        }

        System.out.print("Quantidade comprada: ");
        int qtde = sc.nextInt();

        double nota = preco * qtde;
        double desc = 0;

        System.out.println("O produto custa R$ "+preco);
        System.out.println("A nota ficou no valor de R$ "+nota);

        if (nota <= 250.99) {
           desc = 0.05 * nota;
        } else if (nota >= 251.0 && nota <= 500.0) {
            desc = 0.10 * nota;
        } else if (nota > 500.0) {
           desc = 0.15 * nota;
        }

        System.out.printf("Você terá um desconto de R$ %.2f\n",desc);
        System.out.printf("O preço total da nota com o desconto ficou em R$ %.2f",(nota-desc));

        sc.close();
    }
}