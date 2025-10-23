import java.util.Scanner;

public class Question_9 {

    public static int soma (int n) {

        if (n < 1) {
            return 0;  
            // Vai fazer até o número ser 0 e retornar 0, e então irá voltar
            // somando tudo oque está pendente dentro das chamadas
        } else {
            return n + soma(n - 1);  // Número mais ele mesmo menos um           
        }             

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira um número:");
        int num = sc.nextInt();

        int somaN = soma(num);

        System.out.println("Soma de todos os números até ele: " + somaN);

        sc.close();
    }

}
