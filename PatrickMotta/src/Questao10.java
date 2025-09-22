import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int valorAbsoluto = Math.abs(numero);

        System.out.println("O valor absoluto de " +numero+ " é: " +valorAbsoluto);

    }
}