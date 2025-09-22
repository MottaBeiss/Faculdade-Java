/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/31
*/

/*
2) Faça um algoritmo que armazene as descrições de 10 produtos, armazene também os preços de
venda dos mesmos.
Atualize os preços de venda aplicando o percentual que será lido, por exemplo, 10%. Imprima as
descrições dos produtos e seus novos preços de venda.
*/

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[10];
        double[] preco = new double[nome.length];

        for (int i = 0; i < nome.length;i++) {
            System.out.print("Digite a descrição do "+(i+1)+"º produto: ");
            nome[i] = sc.nextLine();
            System.out.print("Didite o preço do "+(i +1)+"º produto: ");
            preco[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }

        System.out.println("----PRODUTOS CADASTRADOS----");
        for (int i = 0; i < nome.length;i++) {
            System.out.printf("%s: R$ %.2f%n", nome[i], preco[i]);
        }

        System.out.print("\nDigite o percentual de aumento: ");
        double percentual = sc.nextDouble();

        System.out.println("\n----PREÇOS REAJUSTADOS----");
        for (int i = 0; i < preco.length; i++) {
            preco[i] += preco[i] * (percentual / 100);
            System.out.printf("%s: R$ %.2f%n",nome[i],preco[i]);
        }

        sc.close();
    }
}