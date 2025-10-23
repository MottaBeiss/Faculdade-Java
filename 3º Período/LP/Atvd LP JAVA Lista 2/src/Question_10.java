import java.util.Scanner;

public class Question_10 {

    public static String conversor(int num) { 

        if (num == 0) { //'num' será dividido, e sua divisão será passada como parâmetro até ser igual a zero,
                        // Quando isso accontecer.
            return "";  // A String começa a ser gerada nesse retorno para a ultima chamada
        } else  {
            return conversor(num / 2) + num % 2; //  - 'num' dividido (/) por dois faz com que o numero seja divido várias vezes e possamos pegar os restos dessas diferentes divisões
            //  - Chama a recursão para o resto (%) do número.
            //  - Espera ela devolver uma String.
            //  - Pega essa String e adiciona (+) o seu próprio bit no final.
            //  - Retorna a nova String, maior.
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = sc.nextInt();

        String numB = conversor(num);

        System.out.println("Número convertido para binário:\n " + numB + "\n");

        sc.close();
    }

}
