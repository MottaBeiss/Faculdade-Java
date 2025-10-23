/*2. Escreva um programa que leia 20 valores inteiros e informe:
 • o maior e o menor valor digitado;
 • as posições onde eles se encontram no vetor.*/

import java.util.Scanner;

public class Ex2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] num = new int[20];
        int maior = num[0];
        int menor = num[0];
        int posMenor = 0; 
        int posMaior = 0;

        System.out.println("Digite 20 números inteiros");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i+1 + "º número: ");
            num[i] = sc.nextInt();
             if (num[i] > maior) {
                maior = num[i];
                posMaior = i;
             }
             if (num[i] < menor) {
                menor = num[i];
                posMenor = i;
             }
        }

        System.out.printf("Maior valor: %d, Posição: %d \n" +
                          "Menor: %d, Posição: %d", maior, posMaior, menor, posMenor);



        sc.close();
    }

}
