package Estrutura_de_Dados.List3;

public class PRincipal {
public static void main(String[] args) {
        // Criando a lista baseada em referências dinâmicas
        ListaENcadeada listaDin = new ListaENcadeada();

        listaDin.inserirNoInicio(10);
        listaDin.inserirNoFim(30);
        listaDin.inserirNaPosicao(20, 1); // Coloca o 20 entre o 10 e o 30

        System.out.println("Após inserções:");
        listaDin.exibirLista(); // Esperado: 10 -> 20 -> 30 -> null

        System.out.println("Pesquisando o valor 30. Posição: " + listaDin.pesquisar(30));

        listaDin.removerElemento(20);
        System.out.println("Após remover o 20:");
        listaDin.exibirLista(); // Esperado: 10 -> 30 -> null
        
        System.out.println("Tamanho atual: " + listaDin.obterTamanho());
    }
}
