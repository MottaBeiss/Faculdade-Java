public class Principal {
    public static void main(String[] args) {
        // Criando uma lista com capacidade para 10 inteiros
        ListaEncadeada minhaLista = new ListaEncadeada(10);

        // Testando inserções
        minhaLista.inserirNoFim(10);
        minhaLista.inserirNoFim(20);
        minhaLista.inserirNoInicio(5);
        minhaLista.inserirNaPosicao(15, 2); // Insere o 15 na posição 2

        minhaLista.exibirLista(); // Esperado: 5 10 15 20

        // Testando buscas
        int pos = minhaLista.pesquisar(15);
        System.out.println("O número 15 está na posição: " + pos);

        // Testando remoções
        minhaLista.removerNoInicio();
        minhaLista.removerElemento(20);
        
        System.out.println("Tamanho atual da lista: " + minhaLista.obterTamanho());
        minhaLista.exibirLista(); // Esperado: 10 15
    }
}
