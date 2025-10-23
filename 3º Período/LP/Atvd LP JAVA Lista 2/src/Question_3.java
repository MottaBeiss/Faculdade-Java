import java.util.Scanner;

public class Question_3 {

    public static String inversao(String palavra, int i) {

        if (i == palavra.length()) { // Quando o indice for igual ao tamanho da palavra
            return ""; // Irá retonar espaço vazio para a ultima chamada
        } 
            
        return palavra.charAt(palavra.length() - 1 - i) + inversao(palavra, i + 1);
        // Do ultimo caracter para o primeiro + o caracter anterior ao da chamada
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("\nDigite uma palavra:");
        String palavra = sc.nextLine();

        System.out.println("\nPalavra invertida:");

        String invertida = inversao(palavra,0);

        System.out.println(invertida);

        sc.close();
    }

}
