/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/12
 */

import java.util.Scanner;
public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quarto números diferentes que irei colocalos em ordem crescente");
        System.out.print("Digite o primeiro: ");
        int n1 = sc.nextInt();
        System.out.print("Agora o segundo: ");
        int n2 = sc.nextInt();
        System.out.print("O terceiro: ");
        int n3 = sc.nextInt();
        System.out.print("E por ultimo o quarto: ");
        int n4 = sc.nextInt();

        int temp;

        if (n1 > n2) { temp = n1; n1 = n2; n2 = temp; }
        if (n1 > n3) { temp = n1; n1 = n3; n3 = temp; }
        if (n1 > n4) { temp = n1; n1 = n4; n4 = temp; }
        if (n2 > n3) { temp = n2; n2 = n3; n3 = temp; }
        if (n2 > n4) { temp = n2; n2 = n4; n4 = temp; }
        if (n3 > n4) { temp = n3; n3 = n4; n4 = temp; }

        System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);

        sc.close();
    }
}