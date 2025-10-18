import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número (até 93) para retornar o número fibonacci correspondente: ");
        int num = sc.nextInt();

        long[] vetorFib = new long[num];


        if (num <= 2) {
            System.out.println("\nSe digitou '0', valor inválido, digite uma posição a partir de '1'.\n" +
                                "Para o 1º Fibonacci é = 0\n" +
                                 "Para o 2º Fibonacci é = 1");
        } else if (num > 93) {
            System.out.println("Valor muito grande, digite um número menor");
        } else {
            long a = 0;
            long b = 1;
            vetorFib[0] = 0;
            vetorFib[1] = 1;
            for (int i = 2; i < vetorFib.length; i++ ) {
               long c = a + b;
               a = b;
               b = c;
               vetorFib[i] = c;
            }
            System.out.println("Número Fibonacci correspondente: " + vetorFib[num - 1]);
        }

        sc.close();
    }
}
