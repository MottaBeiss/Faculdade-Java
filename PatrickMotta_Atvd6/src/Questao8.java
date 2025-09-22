/*
@author Patrick Moreira Motta - 12127245
@version 1.00 2025/05/18 */

/*
08) Faça um algoritmo que seja capaz de dar a classificação olímpica de 3 países informados. Para cada
país é informado o nome, a quantidade de medalhas de ouro prata e bronze. Considere que cada
medalha de ouro tem peso 3, cada prata tem peso 2 e cada bronze tem peso 1. */

import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int numPaises = 3; //Defino uma costante porque o valor dela não muda, evitando ter que mudar o número de países em vários lugares caso eu precise.

        String[] paises = new String[numPaises];
        //Dois arrays para guardar os paises e os pontos.
        int[] pontos = new int[numPaises];

        int i = 0; //Cria um contador
        while (i < numPaises) {
        System.out.print("Informe o nome do "+(i+1)+"º pais: ");
        paises[i] = sc.nextLine();

        System.out.print("Quantidade medalhas de OURO: ");
        int ouro = sc.nextInt();

        System.out.print("Quantidade medalhas de PRATA: ");
        int prata = sc.nextInt();

        System.out.print("Quantidade medalhas de BRONZE: ");
        int bronze = sc.nextInt();
        sc.nextLine(); // limpa o buffer do scanner.

        pontos[i] = ouro*3 + prata*2 + bronze;
        //Calcula os pontos do pais e passa para o próximo.
        i++;
        }

        int j = 0;   //Crio uma variável j, que vai servir como o índice do país atual que vai comparar com os outros paises.

        while (j < numPaises - 1) {   //Enquanto j for menor que o total de países menos 1, continuamos.

            int k = j + 1;   //Crio outra variável, k, que começa logo depois de j (por isso j + 1). Quero comparar o país j com o país que vêm depois dele na lista.

            while (k < numPaises) {  //Enquanto k for menor que o total de países, continuamos comparando.

                if (pontos[k] > pontos[j]) {   //SE o país de índice k tiver mais pontos que o país de índice j. Significa que eles estão fora de ordem, então eu faço a troca.

                    int pontoTemp = pontos[j];  //Guarda os pontos de j em uma variável temporariamente

                    pontos[j] = pontos[k];  //Realizo a troca

                    pontos[k] = pontoTemp;  // Recupero o valor salvo, que antes era de j e coloco em k

                    String tempPais = paises[j]; // Faz o mesmo com os países
                    paises[j] = paises[k];
                    paises[k] = tempPais;
                }
                k++;
            }
            j++;
            //j vai do primeiro até o penúltimo país.
            //
            //k sempre compara com os países seguintes.
            //
            //Se encontrar um país com pontuação maior, troca os dois.
            //
            //tempPonto serve para não perder o valor antigo na hora de trocar.
            //
            //j < numPaises - 1 evita comparar o último país com ele mesmo ou causar erro.
        }

        System.out.println("\n RANKING OLÍMPICO:");
        int p = 0;
        while (p < numPaises) {
            System.out.printf("%dº lugar: %s com %d ponto(s)%n", p + 1, paises[p], pontos[p]);
            p++;
        }

        sc.close();
    }
}
