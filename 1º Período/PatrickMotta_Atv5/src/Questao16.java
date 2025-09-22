/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/12
 */

import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do depósito: ");
        double dep = sc.nextDouble();
        System.out.print("Digite a quanto tempo está rendendo (de 1 a 3 meses): ");
        int meses = sc.nextInt();

        double rend = dep;

        if ( meses == 1) {
           rend = rend + (rend * 0.15);
            System.out.println("Após 1 mês: Rendimento = " + (rend - dep) + " | Total = " + rend);
        } else if (meses == 2) {
            rend = rend + (rend * 0.15);
            rend = rend + (rend * 0.15);
            System.out.println("Após 2 mês: Rendimento = " + (rend - dep) + " | Total = " + rend);
        } else if (meses == 3) {
            rend = rend + (rend * 0.15);
            rend = rend + (rend * 0.15);
            rend = rend + (rend * 0.15);
            System.out.println("Após 3 mês: Rendimento = " + (rend - dep) + " | Total = " + rend);
        }
        sc.close();

    }
}
