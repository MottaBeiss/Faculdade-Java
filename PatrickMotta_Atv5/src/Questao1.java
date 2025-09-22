/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/04/06
 */

import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a média da sua nota");
        System.out.println("Insire a primeira e as demais notas de forma decimal: ");
        double a = sc.nextDouble();
        System.out.println("Agora a segunda nota: ");
        double b = sc.nextDouble();
        System.out.println("Por fim, a terceira nota: ");
        double c = sc.nextDouble();
        double media = (a + b + c)/3;

        if (media <=3) {
            System.out.printf("Você está REPROVADO, sua média foi de %.2f ",media);
        }
        else if (media >=3 && media <7) {
            System.out.printf("Hmm, não deu... Mas você pode fazer o Exame para conseguir passar, sua média foi de %.2f ",media);
            System.out.print("\n");
            System.out.println("Qual a nota tirada no exame? ");
        double exame = sc.nextDouble();
        if (exame >=6) {
            System.out.println("Você está APROVADO");
        }else {
            System.out.println("Reprovado");
        }
        } else if (media >=7 && media <=10) {
            System.out.printf("Parabéns, você está APROVADO, sua media foi de %.2f",media);
        } else {
            System.out.println("Média invalida, as notas são maiores que o determinado, digite notas com valor entre 1 a 10");
        }

        sc.close();
    }
}
