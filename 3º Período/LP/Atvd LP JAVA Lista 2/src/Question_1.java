import java.util.Scanner;

public class Question_1 {

     public int num;

    public static int recursao(int num) { // Objeto/Função/Método
        if (num < 10 && num > -10) { // retornará o primeiro digito do número para a ultima chamada
            return num; 
        } else {
            return(num % 10) + recursao(num / 10);
            // (num % 10) = Resto da divisão por 10 é igual ao ultimo digito do número
            // (num / 10) = Chamar novamente a função com a divisão por 10, que é igual ao número sem o ultimo digito 
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
