/*3. Escreva um programa que carregue dois vetores inteiros com 5 posições, sendo um com números pares e o outro com números ímpares. O 
usuário pode digitar os números em qualquer sequência e o programa deverá armazená-los no vetor correto na ordem em que foram 
informados pelo usuário. */


import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] pares = new int[5];
        int[] impares = new int[5];
        
        // Controladores para saber quantos números já foram inseridos em cada vetor
        int qtdPares = 0;
        int qtdImpares = 0;
        
        System.out.println("Digite números inteiros. O programa separará em pares e ímpares.");
        System.out.println("A coleta termina quando ambos os vetores (5 posições cada) estiverem cheios.");
        
        // Continua rodando enquanto pelo menos um dos vetores ainda tiver espaço
        while(qtdPares < 5 || qtdImpares < 5) {
            System.out.print("\nDigite um número: ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) { // É par
                if (qtdPares < 5) {
                    pares[qtdPares] = numero;
                    qtdPares++;
                } else {
                    System.out.println("O vetor de pares já está cheio! Número ignorado.");
                }
            } else { // É ímpar
                if (qtdImpares < 5) {
                    impares[qtdImpares] = numero;
                    qtdImpares++;
                } else {
                    System.out.println("O vetor de ímpares já está cheio! Número ignorado.");
                }
            }
        }
        
        System.out.println("\n--- Vetor de Pares ---");
        for(int i = 0; i < 5; i++) System.out.print(pares[i] + " ");
        
        System.out.println("\n\n--- Vetor de Ímpares ---");
        for(int i = 0; i < 5; i++) System.out.print(impares[i] + " ");
        
        scanner.close();
    }
}
