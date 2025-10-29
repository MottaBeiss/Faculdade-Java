/* 15. Implemente uma função recursiva que receba um número
* inteiro n e retorne a soma dos números de 1 até n.
* Exemplo: soma(5) → 15 
 */

import java.util.Scanner;

public class Ex15 {

    public static int soma (int num) {
        
        if (num <= 0) {
            return 0;
        } 
        return num + soma(num - 1);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println("Resultado da soma de 1 até " + num + ": " + soma(num));
        
        sc.close();
    }

}
