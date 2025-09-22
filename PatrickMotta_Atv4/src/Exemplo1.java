import java.util.Scanner;
public class Exemplo1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da prestação: ");
        double prest = sc.nextDouble();
        double acres = (prest * 15/100);
        double desc = ((prest + acres)* 15/100);
        double preju = acres - desc;

        System.out.println("O valor final a pagar séra de R$ "+acres);
        System.out.print("O prejuízo do comerciante foi de R$ "+preju);

        sc.close();
    }
}