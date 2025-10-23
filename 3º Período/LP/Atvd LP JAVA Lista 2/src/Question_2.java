import java.util.Scanner;

public class Question_2 {

    public int potencia(int base, int expo){ // Método / Membro de instância (Não estático)

        if (expo == 0) { // todo número diferente de zero elevado a 0 é igual a 1
            return 1;
        } else {
            return base * (potencia (base, expo - 1)); 
        // base vezes o resultado da potencia com o expoente - 1, só chegará na resposta quando o mesmo for igual a 1, ai ele volta retornando os resultados, e a base é multiplicada por eles.
        } 
        
    /* Exemplo: potencia(5, 3) precisa de...
                  ↳ potencia(5, 2) que precisa de...
                     ↳ potencia(5, 1) --> encontra a resposta! Retorna 5

            ...agora as respostas voltam:

                 ↳ potencia(5, 2) recebe 5, calcula 5 * 5 e retorna 25
             potencia(5, 3) recebe 25, calcula 5 * 25 e retorna 125
 */ 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("\nDigite a base e o expoente para calcularmos a pôtencia:");
        System.out.print("\nBase: ");
        int base = sc.nextInt();

        System.out.print("Expoente: ");
        int expo = sc.nextInt();


        Question_2 calculadora = new Question_2(); // Criando um Objeto da classe

       int result = calculadora.potencia(base, expo); // Chamando o método A PARTIR do objeto e guardando em uma variável int.

        System.out.println(result);



    sc.close();
    }

}

/*  A sua dúvida é sobre um conceito fundamental em Java: a diferença entre membros estáticos (static) e membros de instância (não-estáticos).

Método static (como o main): Pertence à classe em si. Ele existe sem que você precise criar um objeto. Pense nele como uma regra geral ou uma ferramenta associada ao "molde" da classe.

Método não-static (como o potencia): Pertence a um objeto específico (uma instância) da classe. Para usá-lo, você precisa primeiro criar um objeto. Pense nele como uma ação que um objeto específico pode realizar. */