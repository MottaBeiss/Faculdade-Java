/* 17. Desenvolva uma função recursiva que calcule o n-ésimo termo da sequência de Fibonacci.
 Exemplo: fibonacci(6) → 8
 */

import java.util.Scanner;

public class Ex17 {

    public static int posFibo (int num) {
        if (num < 0) {
        // Lança uma exceção para indicar um argumento inválido
        throw new IllegalArgumentException("A posição não pode ser negativa.");
        } else if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return posFibo(num - 1) + posFibo(num - 2);
        }
        
        
}
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite uma posição da sequencia de fibonacci (nesse caso 0 também é posição):");
        int num = sc.nextInt();

        System.out.printf("\nNúmero: %d \n" +
                          "Termo na posição informada: %d ", num, posFibo(num));
        System.out.println("\n");
        
        sc.close();
    }

}
