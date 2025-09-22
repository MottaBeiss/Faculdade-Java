/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/17 */

/*
02) Faça um algoritmo que receba o nome e três notas de cada aluno. Serão 10 alunos.
Calcule e imprima:
• A média da classe.
• A quantidade de alunos aprovados, isto é, com notas >= 60.0.
• A quantidade de alunos reprovados, isto é, com notas < 60.0. */


import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAlunos = 10;
        int aprovados = 0;
        int reprovados = 0;
        double somaDasMedias = 0;

        for ( int i = 1 ; i <= totalAlunos ; i++ ) {

            System.out.print("Informe o nome do " +i+"º aluno: ");
            String alun = sc.next();

            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();

            System.out.print("Nota 3: ");
            double n3 = sc.nextDouble();

            double mediaDoAluno = (n1 + n2 + n3) /3;

            // Acumula a média na soma total
            somaDasMedias += mediaDoAluno;

            // Verifica se o aluno foi aprovado ou reprovado
            if (mediaDoAluno >= 60.0) {
                aprovados++;
            } else {
                reprovados++;
            }

            System.out.printf("Media de %s: %.2f",alun, mediaDoAluno);
            System.out.println("\n");
        }

        // Calcula a média da classe
        double mediaClasse = somaDasMedias / totalAlunos;

        System.out.println("=== RESULTADOS FINAIS ===");
        System.out.printf("Média da classe: %.2f\n",mediaClasse);
        System.out.println("Quantidade de alunos aprovados: " +aprovados);
        System.out.println("Quantidade de alunos reprovados: " +reprovados);

        sc.close();
    }
}
