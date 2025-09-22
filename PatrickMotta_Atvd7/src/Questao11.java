/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
11) Crie um vetor de 4 palavras (String[]) e junte todas em uma única string, exibindo o resultado.
*/

public class Questao11 {
    public static void main(String[] args) {

        String[] palavra = {"Pen", "Pineapple", "Apple", "Pen"};
        String resultado = "";

        for (int i = 0; i < palavra.length; i++) {
           resultado = resultado + palavra[i] + "";
        }

        System.out.print(resultado);
    }
}
