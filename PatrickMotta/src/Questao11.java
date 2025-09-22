import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double num = ler.nextDouble();

        System.out.printf("A raiz quadrada do número %.2f é %.2f ", num, Math.sqrt(num));

    }

}