/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
03) Crie um vetor de 6 elementos de inteiros e calcule a soma de todos os seus elementos, mostrando
o resultado na tela.
*/

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];
        int soma = 0;

        for (int i = 0; i < vetor.length;i++) {
            System.out.print("Digite o "+(i+1)+"º numero inteiro: ");
            vetor[i] = sc.nextInt();
        }

        for(int i = 0; i<vetor.length; i++){
            soma = soma + vetor[i];
        }

        System.out.println("Soma: "+soma);

        sc.close();
    }
}
