import java.util.Scanner;

public class Question_1 {

     public int num;

    public static int recursao(int num) {
        if (num < 10) {
            return num;
        } else {
            return(num % 10) + recursao(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("\nDigite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println("\nA soma dos digitos do número é: ");

             int soma = recursao(num);

             System.out.println(soma);

    

    sc.close();
    }
}
