/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/18 */

/*
06) Em uma eleição presidencial existem quatro candidatos. Os votos são informados por códigos.
Os dados utilizados para a escrutinagem obedecem à seguinte codificação:
• 1, 2, 3, 4 = voto para os respectivos candidatos
• 5 = voto nulo
• 6 = voto em branco

Faça um algoritmo em pseudocódigo e um programa em Java que calcule e escreva:
• O total de votos para cada candidato e seu percentual sobre o total
• O total de votos nulos percentual sobre o total
• O total de votos brancos e seu percentual sobre o total
Como finalizador do conjunto de votos tem-se o valor “ 0 “. */

import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("VOTAÇÃO INICIADA");

        int votosSarah = 0, votosJulia = 0, votosDaisy = 0, votosGledson = 0;
        int nulos = 0, brancos = 0;

        int voto = -1;

        while (voto != 0) {
            System.out.println("\nDigite:");
            System.out.println("1 para votar na Sarah");
            System.out.println("2 para votar na Júlia");
            System.out.println("3 para votar na Daisy");
            System.out.println("4 para votar no Gledson");
            System.out.println("5 para Voto nulo");
            System.out.println("6 para Voto em branco");
            System.out.println("0 para finalizar votação");
            System.out.print("\nDigite o seu voto: ");
            voto = sc.nextInt();

            switch (voto) {
                case 1: votosSarah++; break;
                case 2: votosJulia++; break;
                case 3: votosDaisy++; break;
                case 4: votosGledson++; break;
                case 5: nulos++; break;
                case 6: brancos++; break;
                case 0:
                    System.out.println("\nVotação encerrada!");
                    break;
                default:
                    System.out.println("\nVALOR INVÁLIDO! TENTE NOVAMENTE.");
            }
        }

        int totalVotos = votosSarah + votosJulia + votosDaisy + votosGledson + nulos + brancos;

        if (totalVotos == 0) {
            System.out.println("Nenhum voto registrado.");
        } else {
            System.out.println("\n========= RESULTADOS DA ELEIÇÃO =========");
            System.out.println("Total de voto(s): " + totalVotos);
            System.out.printf("Sarah: %d voto(s). Percentual: (%.2f%%)%n",votosSarah,votosSarah*100.0/totalVotos);
            System.out.printf("Júlia: %d voto(s). Percentual: (%.2f%%)%n",votosJulia,votosJulia*100.0/totalVotos);
            System.out.printf("Daisy: %d voto(s). Percentual: (%.2f%%)%n",votosDaisy,votosDaisy*100.0/totalVotos);
            System.out.printf("Gledson: %d voto(s). Percentual: (%.2f%%)%n",votosGledson,votosGledson*100.0/totalVotos);
            System.out.printf("Nulo: %d voto(s). Percentual: (%.2f%%)%n",nulos,nulos*100.0/totalVotos);
            System.out.printf("Branco: %d voto(s). Percentual: (%.2f%%)%n",brancos,brancos*100.0/totalVotos);
        }
        sc.close();
    }
}