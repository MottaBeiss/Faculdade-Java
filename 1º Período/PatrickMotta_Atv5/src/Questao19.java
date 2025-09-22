/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/13
 */

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de combustível vendido (em litros): ");
        double litros = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite qual o tipo de combustível vendido (álcool ou gasolina): ");
        String tipoCombustivel = sc.nextLine().toLowerCase();

        double valor = 0;
        String tipo;

        switch (tipoCombustivel) {
            case "álcool":
                tipo = "A";
                if (litros <= 20) {
                    valor = (litros * 4.60) * 0.97;
                } else {
                    valor = (litros * 4.60) * 0.95;
                }
                System.out.printf("Tipo: %s\nValor a ser pago: R$ %.2f\n", tipo, valor);
                break;

            case "gasolina":
                tipo = "G";
                if (litros <= 20) {
                    valor = (litros * 6.40) * 0.96;
                } else {
                    valor = (litros * 6.40) * 0.94;
                }
                System.out.printf("Tipo: %s\nValor a ser pago: R$ %.2f\n", tipo, valor);
                break;

            default:
                tipo = "desconhecido";
                System.out.println("Tipo " + tipo);
                break;
        }

        sc.close();
    }
}

