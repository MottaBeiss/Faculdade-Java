import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int somaI = 0;
        int somaMultNum = 0;
        int multNum;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i+1 + "º número: ");
            num[i] = sc.nextInt();
            multNum = num[i] * i;     // Multiplicar cada número pelo seu índice
            somaMultNum += multNum;   // Somar todos os resultados das multiplicações
            somaI += i;               // Somar todos os índices
        }

        double mediaPond = somaMultNum / somaI; // Dividir a soma das multiplicações pela soma dos índices

        System.out.println("\nA média ponderada dos números digitados é: " + mediaPond);

        sc.close();
    }

}
