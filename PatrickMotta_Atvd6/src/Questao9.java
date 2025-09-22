/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/19 */

/*
09) Faça um algoritmo que calcule a média aritmética de um conjunto de números pares que
forem fornecidos pelo usuário. O valor de finalização será a entrada do número “0”.
Observe que nada impede que o usuário forneça quantos números impares quiser , com a
ressalva de que eles não poderão ser acumulados. */

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=0, par,  totalPar=0, numPar=0;

        while (true) {
            System.out.println("Número par: ");
            par = sc.nextInt();

            if ((par%2 == 0) && (par > 0)){
                totalPar += par;
                numPar++;
            }

            if (par == 0){
                break;
            }
        }

        int mediaPar = totalPar / numPar;

        System.out.println("A média dos números digitados é: " + mediaPar);

        sc.close();
    }
}
