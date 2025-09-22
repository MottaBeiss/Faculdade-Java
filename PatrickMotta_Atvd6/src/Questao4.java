/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/17 */

/*
04) Faça um algoritmo que imprima os números ímpares de 1 até 100. */

public class Questao4 {
    public static void main(String[] args) {

        for (int i = 0;i < 100;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
