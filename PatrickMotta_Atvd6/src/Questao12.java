/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/19 */

/*
12) Faça um programa que leia a descrição do produto, o preço unitário e a quantidade. Imprima o valor
total da compra. O cliente pode escolher mais de um produto e a leitura se encerra quando for
digitado FIM na descrição do produto.
 */

import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String descricaoProduto;
        double valorProduto, totalCompra=0;
        int quantProduto;

        do {
            System.out.println("Digite a descrição do produto: \n[para encerrar digite 'FIM']");
            descricaoProduto = sc.next();

            if (descricaoProduto.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.print("Valor do produto: ");
            valorProduto = sc.nextDouble();

            System.out.print("Quantidade de produtos: ");
            quantProduto = sc.nextInt();

            totalCompra += (valorProduto * quantProduto);

        } while (true);

        System.out.printf("O valor total da sua compra foi de R$%.2f", totalCompra);
        sc.close();
    }
}
