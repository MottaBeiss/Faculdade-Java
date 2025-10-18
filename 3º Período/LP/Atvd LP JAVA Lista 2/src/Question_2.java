import java.util.Scanner;

public class Question_2 {

    public static int potencia(int base, int expo){

        if (expo == 0) {
            return 1;
        } else if (expo == 1) {
            return base;
        } else {
            return base * (potencia (base, expo - 1));
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("\nDigite a base e o expoente para calcularmos a pôtencia:");
        System.out.print("\nBase: ");
        int base = sc.nextInt();

        System.out.print("Expoente: ");
        int expo = sc.nextInt();

        int result = potencia(base, expo);

        System.out.println(result);



    sc.close();
    }

}
