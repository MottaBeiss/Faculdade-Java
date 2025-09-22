/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade nadador: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Sua categoria é a Infantil");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria Juvenil é a ideal para você");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("Que legal, você se encaixa na categoria Adolescente");
        } else if (idade >= 16 && idade <= 30) {
            System.out.println("Adulto é a sua categoria");
        } else if (idade > 30) {
            System.out.println("Quanta experiência, você é um Sênior");
        }
        sc.close();
    }
}
