/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 4531;

        System.out.print("Digite a senha: ");
        int senhadigitada = sc.nextInt();

        if (senhadigitada == senha){
            System.out.println("Acesso permitido");
        } else{
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
