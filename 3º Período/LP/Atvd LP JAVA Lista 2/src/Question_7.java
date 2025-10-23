import java.util.Scanner;

public class Question_7 {

    // Algoritmo de Euclides: O MDC de dois números é igual ao MDC do número menor e do resto da divisão do maior pelo menor.

    public static int calculo (int num1, int num2) { // Maior dividido pelo menor até dar resto 0, quando der 0 o menor dos 2 será o MDC
    
        if (num1 % num2 == 0) {
         return num2;
        } else {
        return calculo (num2, num1 % num2); 
        // retorna o menor número e o resto do primeiro pelo segundo
        // Fazendo com que sempre descartemos o número maior
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite dois  números inteiros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int mdc = calculo(num1,num2);

        System.out.println("\nO MDC dos números digitados é: " + mdc + "\n");

        sc.close();
    }
}
