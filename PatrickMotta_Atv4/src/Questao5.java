/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/26
 */

import java.util.Scanner;
public class Questao5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a capacidade do tanque do veículo: ");
        double capacidadeTanque = sc.nextDouble();

        System.out.print("Informe a quantidade de litros e a quilometragem percorrida desde o último abastecimento: ");
        double quantidadeLitros = sc.nextDouble();
        double quilometragem = sc.nextDouble();
        double consumo = quilometragem / quantidadeLitros;
        double autonomia = capacidadeTanque * consumo;

        System.out.printf("Você teve um consumo de %.2fKm/L, e possui uma autonomia de %.2fKm.",consumo,autonomia);

        sc.close();

    }
}