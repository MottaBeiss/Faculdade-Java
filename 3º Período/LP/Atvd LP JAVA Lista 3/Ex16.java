/*  16. Crie uma função recursiva que calcule o fatorial de um número informado pelo usuário.
 Exemplo: fatorial(5) → 120
  */

import java.util.Scanner;

public class Ex16 {

    public static int fatorial (int num) {
        
        if (num <= 0) {
            return 1;
        } 
        return num * fatorial(num - 1);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println("Fatorial de " + num + ": " + fatorial(num));
        
        sc.close();
    }

}
