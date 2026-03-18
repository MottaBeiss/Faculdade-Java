/*1. Escreva um programa que leia dois vetores inteiros com dez posições cada. A partir desses vetores, carregue um terceiro vetor onde o valor 
de cada elemento será a média dos elementos de mesmo índice nos dois vetores anteriores */

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        double[] vetorMedia = new double[10]; // Usamos double para armazenar médias fracionadas
        
        System.out.println("--- Preenchendo o Vetor 1 ---");
        for(int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i+1) + " do vetor 1: ");
            vetor1[i] = scanner.nextInt();
        }
        
        System.out.println("\n--- Preenchendo o Vetor 2 ---");
        for(int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i+1) + " do vetor 2: ");
            vetor2[i] = scanner.nextInt();
            
            // Aproveitamos o mesmo laço para já calcular a média e poupar processamento
            vetorMedia[i] = (vetor1[i] + vetor2[i]) / 2.0; 
        }
        
        System.out.println("\n--- Vetor Resultante (Médias) ---");
        for(int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + vetorMedia[i]);
        }
        
        scanner.close();
    }
}
