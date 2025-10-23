import java.util.Scanner;

public class Question_6 {

    public static boolean comparar (String palavra, int i) {

        if (i == palavra.length()) { 
            // Quando o i acabar de percorrer a palavra, a função para de ser chamada e retorna verdadeiro
        return true;
        }
         if (palavra.toUpperCase().charAt(i) != palavra.toUpperCase().charAt(palavra.length() - 1 - i )) {
            // Essa comparação verifica se a primeira letra é diferente da ultima, se for ela para e retorna falsa
            return false;
        } else {
            return comparar (palavra, i++); // Se for verdadeiro ela continua chamando a função até acabar a palavra 
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("\nDigite uma sequencia de caracteres:");
        String palavra = sc.nextLine();

        boolean palindromo = comparar(palavra,0);

        if (palindromo == true) {
            System.out.printf("%b, Isso é um palíndromo",palindromo);

        } else {
            System.out.printf("%b, Isso não é um palíndromo",palindromo);
        }
        
       
        sc.close();
    }
  }
