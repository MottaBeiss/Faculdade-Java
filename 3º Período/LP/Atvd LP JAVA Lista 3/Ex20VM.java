import java.util.Random;

public class Ex20VM {
    public static void main(String[] args) {
        Random gerador = new Random();

        int[] vet = new int [5];

        System.out.print("\nVetor: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = gerador.nextInt(10);
            System.out.print(vet[i] + " ");
        }

        int maior = vet[0];

        System.out.printf("\nMaior número do vetor: %d", buscarMaior(vet,0,maior));
        System.out.println("\n");

    }

    public static int buscarMaior (int[] vet, int i,int maior) {

        if (i == vet.length) {
            return maior;
        } 
        if (vet[i] > maior) {
            maior = vet[i];
            return buscarMaior(vet,i + 1,maior);
        }
        return buscarMaior(vet,i + 1,maior);
    }
}
