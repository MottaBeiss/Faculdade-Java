import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        double num = sc.nextInt();

        double[] vetor = new double[100];
        vetor[0] = num;

        for (int i = 0; i < vetor.length - 1; i++) {
            vetor[i + 1] = vetor[i] / 2;
        }

        System.out.println("\nVetores preenchidos:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}
