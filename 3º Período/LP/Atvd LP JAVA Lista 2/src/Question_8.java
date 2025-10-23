import java.util.Scanner;

public class Question_8 {

    public static int contador (int[] vet, int indice) {

        if (indice == vet.length) { // A rercusão acaba quando o valor do índice for igual ao tamanho do vetor, consequentemente depois de passar por todo o vetor
            return 0;   // Retorna 0 pois os valores serão somados na volta, com a quantidade que as chamadas anteriores possuem 
        } else if (vet[indice] % 2 == 0) { // Se for par
            return 1 + contador (vet,indice + 1); // Ele soma 1 + a função com o proximo índice
        } else {
            return contador (vet,indice + 1); // Caso contrário ele vai para o próximo índice sem somar nada
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int [5]; 

        System.out.println("Preecha o array:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%dº número: ", i + 1 );
            vetor[i] = sc.nextInt();
        }

        int pares = contador(vetor,0);

        System.out.println("Números pares dentro do vetor: " + pares);

    sc.close();
    }
}

//O que indice++ faz: Usa indice agora, incrementa depois. (Incorreto para este caso)
//O que indice + 1 faz: Calcula o novo valor e passa esse resultado para a função. (Correto para este caso)
