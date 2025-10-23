import java.util.Scanner;

public class Question_4 {

    public int maior (int[] vet,int indice) {


        if (indice == vet.length - 1) { // Se o valor do índice for igual ao tamanho do vetor
            return vet[indice];         // Retorna o valor que está no índice
        }

        int resultado = maior (vet,indice + 1); 
        // Para saber qual é o maior número, ele precisa saber qual o maior número a partir da posição 1, quando o indice é 0 ele só sabe oque está nele.
        // Então ele vai perguntando para o proximo indíce qual o maior número a partir dele, quando chegar no ultimo ele retorna ele mesmo
        // Depois que retorna ele mesmo, todas as chamadas anteriores recebem suas respectivas respostas
        // Quando cada chamada receber sua resposta, ela será comparada com o valor que elas possuem

        // Cada chamada terá um "resultado" próprio que só irá mudar quando a comparação for feita, que é o valor do índice que está nela
        // Então a comparação é feita para cada chamada

        if (vet[indice] > resultado) { // se o valor do índice dela for maior que o resultado que ela recebeu
            return vet[indice];        // ela retorna ela mesma para a chamada anterior
        } else {
            return resultado;          // caso contrario ela retornará o resultado que ela recebeu
        }
          // quando todas as chamadas forem comparadas a variável resultado terá o seu valor final
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[4];

        System.out.println("\nInsira valores inteiros até preencher o vetor:");

        for (int i = 0; i < vetor.length; i++ ) {
            System.out.print((i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        Question_4 buscador = new Question_4();
        int numMaior = buscador.maior(vetor,0);

        System.out.println(numMaior);


        sc.close();
    }
}