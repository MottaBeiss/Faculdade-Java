/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/28
 */

import java.util.Scanner;
public class Questao6 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço de fábrica do seu veículo: ");
        double precoFabrica = sc.nextDouble();
        double pagoaDistribuidora = 0.12 * precoFabrica;
        double imposto = 0.45 * precoFabrica;
        double total = precoFabrica + pagoaDistribuidora + imposto;

        System.out.println("O valor pago a distribuidora é de R$ "+pagoaDistribuidora);
        System.out.println("O valor dos impostos é de R$ "+imposto);
        System.out.print("O custo total ao consumidor será de R$ "+total);

        sc.close();

    }
}
