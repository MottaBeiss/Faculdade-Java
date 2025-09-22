import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        char carc;
        int num;

        System.out.print("Digite um caracter: ");
        carc=ler.next().charAt(0);

        System.out.print("Digite um número: ");
        num=ler.nextInt();

        System.out.println("Este é o caracter digitado: "+carc);
        System.out.print("Este é o número digitado: "+num);

    }
}
