/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/29
 */

import java.util.Scanner;
public class Questao8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da prestação: ");
        double prestacao = sc.nextDouble();
        double valorJuros = prestacao + (0.15 * prestacao);
        double valorDesconto = valorJuros - (0.15 * valorJuros);
        double prejuizo = valorJuros - valorDesconto;

        System.out.println("O valor final a pagar séra de R$ "+valorDesconto);
        System.out.print("O prejuízo do comerciante foi de R$ "+prejuizo);

        sc.close();
    }
}
