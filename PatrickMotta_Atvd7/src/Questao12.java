/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/25
*/

/*
12) Crie três vetores: um de 10 posições de caractere que irá armazenar o nome de 10 pessoas, um
de 10 posições de inteiro que irá armazenar a idade de 10 pessoas, um de 10 posições de reais
que irá armazenar a altura de 10 pessoas. Imprima o nome, a idade e a altura de cada uma das
pessoas.
*/

public class Questao12 {
    public static void main(String[] args) {

        String[] nome = {"Daisy", "Gledson", "Vilma", "Fayer", "Fagner", "Alexandre", "Erick", "Jéssica", "Sarah", "Naiara"};
        int[] idade = {39, 43, 70, 17, 42, 21, 21, 16, 20, 32};
        double[] altura = {1.65, 1.70, 1.62, 1.75, 1.80, 1.73, 1.78, 1.75, 1.60, 1.60};

        for (int i = 0; i < nome.length; i++) {
            System.out.println((i+1)+"º");
            System.out.println("Nome: "+nome[i]);
            System.out.println("Idade: "+idade[i]);
            System.out.println("Altura: "+altura[i]);
            System.out.println();
        }
    }
}
