import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        boolean valor1, valor2;

        System.out.println("Digite true ou false ");
        valor1=ler.nextBoolean();

        System.out.println("Digite true ou false ");
        valor2=ler.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos são verdadeiros! Resultado é verdadeiro");
        } else {
            System.out.println("Pelo menos um é falso! Resultado é falso");
        }
    }
}