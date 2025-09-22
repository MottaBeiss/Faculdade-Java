/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/17 */

/*
05) Desenvolva um algoritmo que receba 5 números reais (double), calcule e mostre: a soma total de
todos os números digitados; a média de todos os números digitados; o dobro de todos os números
digitados. */

import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaValor = 0;
        double mediaValor = 0;
        double dobroValor = 0;

        for (int i = 0; i < 5;i++) {
            System.out.print("Informe o "+(i+1)+"º valor: ");
            double valor = sc.nextInt();

            somaValor += valor;
            mediaValor = somaValor / valor;
            dobroValor = somaValor * 2;
        }

        System.out.print("\n");
        System.out.println("=== RESULTADOS FINAIS ===");
        System.out.printf("Soma: %.2f\n",somaValor);
        System.out.printf("Media: %.2f\n",mediaValor);
        System.out.printf("Dobro: %.2f\n",dobroValor);

        sc.close();
    }
}
