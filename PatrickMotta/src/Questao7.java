import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num;
        float num2, soma;

        System.out.println("Digite um número inteiro");
        num=ler.nextInt();

        System.out.print("Digite um número real ");
        num2=ler.nextFloat();

        soma= num + num2;

        System.out.println("Este é resultado da soma: "+soma);

    }
}
