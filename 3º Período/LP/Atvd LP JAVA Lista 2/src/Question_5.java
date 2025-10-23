import java.util.Scanner;

public class Question_5 {

    public static int somarValores (int[] vet, int i) {
    
         if (i == vet.length) { 
        // Esse if só está retornando 0 para determinar quando a função acaba, para parar de ficar chamando a função quando acabar de percorrer o vetor
            return 0;         
        } else {
            return vet[i] + somarValores (vet,i + 1); 
            // Mesma lógica da questão 4, só que ao invés de comparar e retornar o maior ele vai somar os resultados recebidos pelas chamadas anteriores
         }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] array = new int[5];

        System.out.println("\nInsira valores inteiros até preencher o vetor:");

        for (int i = 0; i < array.length; i++ ) {
            System.out.print((i + 1) + "º valor: ");
            array[i] = sc.nextInt();
        }

        int resultado = somarValores(array, 0);

        System.out.println(resultado);


    sc.close();
    }
}
