import java.util.Scanner;

public class Questao3 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        char letra;

        System.out.println("Digite um caracter");
        letra=sc.next().charAt(0);

        System.out.println("Este é o caracter digitado: "+letra);
    }
}
