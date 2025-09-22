/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/06
*/

/*
01) Elaborar um algoritmo que leia 10 valores inteiros. O algoritmo não poderá aceitar o número zero.
Mostrar:
a. A quantidade de números pares.
b. A quantidade de números impares.
c. A soma de todos os valores pares.
d. A soma de todos os valores impares.
*/


import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantdPares = 0;
        int quantdImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for(int i = 1; i <= 10; i++){
            int num;

            // Solicita número até que seja diferente de zero
            do {
                System.out.print("Digite o "+i+"º número (diferente de zero): ");
                num = sc.nextInt();

                if (num == 0){
                    System.out.println("Zero não é permitido. Tente novamente.");
                }
            } while (num == 0 );

            // Verifica se é par ou ímpar e atualiza os contadores e somas
            if (num % 2 == 0){
                quantdPares++;
                somaPares += num;
            } else {
                quantdImpares++;
                somaImpares += num;
            }
        }

        // Mostra os resultados
        System.out.println("\nRESULTADOS:");
        System.out.println("Quantidade de pares: " + quantdPares);
        System.out.println("Quantidade de impares: " + quantdImpares);
        System.out.println("Soma de pares: " + somaPares);
        System.out.println("Soma de impares: " + somaImpares);

        sc.close();
    }

}
