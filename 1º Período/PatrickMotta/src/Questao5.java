import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num, num2, soma;

        System.out.println("Digite o primeiro número ");
        num=ler.nextInt();

        System.out.println("Digite o segundo número ");
        num2=ler.nextInt();

        soma = num + num2;

        System.out.println("Este é resultado da soma: "+soma);

    }
}
