/* 3. Crie um programa que leia um vetor de 50 posições com valores inteiros. Solicite duas posições e 
exiba o resultado da divisão entre os valores dessas posições (tratando possíveis divisões por 
zero). */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int[] num = new int[50];

    System.out.println("Digite 50 números inteiros");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i+1 + "º: ");
            num[i] = sc.nextInt();
        }

    System.out.println("Informe duas posições do vetor, de 0 a 49");
    int r1 = sc.nextInt();
    int r2 = sc.nextInt();

    if (r1 < 0 || r1 > num.length || r2 < 0 || r2 > num.length ) {
        System.out.println("Posição inválida");
    }

    if (num[r1] == 0 && num[r2] == 0) {
        System.out.printf("Valores escolhidos: %d e %d \n" +
                        "Resultado da divisão: Indeterminado", num[r1], num[r2]);
    } else if (num[r2] == 0) {
        System.out.printf("Valores escolhidos: %d e %d \n" +
                        "Resultado da divisão: Indefinido", num[r1], num[r2]);
    }else{ 
        System.out.printf("Valores escolhidos: %d e %d \n" +
                        "Resultado da divisão: %d", num[r1], num[r2], num[r1] / num[r2]);
    }

    sc.close();
    }
}
