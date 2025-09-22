import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float num, num2, mult;

        System.out.println("Digite o primeiro número ");
        num=ler.nextFloat();

        System.out.println("Digite o segundo número ");
        num2=ler.nextFloat();

        mult= num * num2;

        System.out.println("Este é resultado da multiplicação: "+mult);

    }
}
