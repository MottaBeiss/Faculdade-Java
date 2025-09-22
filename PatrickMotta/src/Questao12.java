import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num=ler.nextInt();
        ler.nextLine();

        System.out.println("Digite uma letra: ");
        char letra=ler.next().charAt(0);

        System.out.printf("A letra digitada foi: %c, e o número digitado foi: %d ", letra, num);
    }
}