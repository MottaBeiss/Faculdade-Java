package Estrutura_de_Dados.List3;

public class ListaENcadeada {
private Nodo primeiro; // Aponta para o início da lista [cite: 827]
    private Nodo ultimo;   // Aponta para o fim da lista [cite: 827]
    private int tamanhoAtual;

    // EXERCÍCIO 2: Criar uma lista vazia
    public ListaENcadeada() {
        this.primeiro = null; // Lista nasce apontando para o vazio [cite: 838, 841]
        this.ultimo = null;
        this.tamanhoAtual = 0;
    }

    // EXERCÍCIO 12: Retornar o número de elementos
    public int obterTamanho() {
        return this.tamanhoAtual;
    }

    // EXERCÍCIO 10: Exibir o conteúdo da lista
    public void exibirLista() {
        if (primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.print("Conteúdo da Lista: ");
        Nodo atual = primeiro; // Começa na cabeça da lista
        while (atual != null) { // Caminha até o fim (nulo)
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo; // Pula para o próximo nodo
        }
        System.out.println("null");
    }

    // EXERCÍCIO 3: Inserir no início da lista
    public void inserirNoInicio(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (primeiro == null) { // Se a lista estiver vazia
            primeiro = novoNodo;
            ultimo = novoNodo;
        } else {
            novoNodo.proximo = primeiro; // A seta do novo aponta para o antigo primeiro [cite: 852]
            primeiro = novoNodo;         // A cabeça da lista passa a ser o novo nodo
        }
        tamanhoAtual++;
    }

    // EXERCÍCIO 4: Inserir no fim da lista
    public void inserirNoFim(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (primeiro == null) {
            primeiro = novoNodo;
            ultimo = novoNodo;
        } else {
            ultimo.proximo = novoNodo; // O antigo último aponta para o novo [cite: 866]
            ultimo = novoNodo;         // O gerenciador atualiza quem é o último [cite: 870]
        }
        tamanhoAtual++;
    }

    // EXERCÍCIO 5: Inserir em uma posição específica
    public void inserirNaPosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > tamanhoAtual) {
            System.out.println("Erro: Posição inválida.");
            return;
        }
        if (posicao == 0) {
            inserirNoInicio(valor);
        } else if (posicao == tamanhoAtual) {
            inserirNoFim(valor);
        } else {
            Nodo novoNodo = new Nodo(valor);
            Nodo atual = primeiro;
            // Caminha até o nodo ANTERIOR à posição desejada
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            novoNodo.proximo = atual.proximo; // Novo nodo aponta para o próximo [cite: 881]
            atual.proximo = novoNodo;         // Nodo anterior aponta para o novo [cite: 878]
            tamanhoAtual++;
        }
    }

    // EXERCÍCIO 6: Remover no início
    public void removerNoInicio() {
        if (primeiro != null) {
            primeiro = primeiro.proximo; // A cabeça pula para o segundo elemento [cite: 898]
            tamanhoAtual--;
            if (tamanhoAtual == 0) { // Se esvaziou, o último também é nulo
                ultimo = null;
            }
        } else {
            System.out.println("Erro: Lista vazia.");
        }
    }

    // EXERCÍCIO 7: Remover no fim
    public void removerNoFim() {
        if (primeiro == null) {
            System.out.println("Erro: Lista vazia.");
            return;
        }
        if (primeiro == ultimo) { // Só tem um elemento
            primeiro = null;
            ultimo = null;
        } else {
            Nodo atual = primeiro;
            // Caminha até o PENÚLTIMO elemento
            while (atual.proximo != ultimo) {
                atual = atual.proximo;
            }
            atual.proximo = null; // Corta a ligação com o último [cite: 911]
            ultimo = atual;       // O penúltimo vira o último
        }
        tamanhoAtual--;
    }

    // EXERCÍCIO 8: Remover em posição específica
    public void removerNaPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanhoAtual) {
            System.out.println("Erro: Posição inválida.");
            return;
        }
        if (posicao == 0) {
            removerNoInicio();
        } else if (posicao == tamanhoAtual - 1) {
            removerNoFim();
        } else {
            Nodo atual = primeiro;
            // Caminha até o nodo ANTERIOR ao que será removido
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            // A seta do nodo anterior "pula" o nodo alvo, ligando-se ao próximo [cite: 920, 921]
            atual.proximo = atual.proximo.proximo; 
            tamanhoAtual--;
        }
    }

    // EXERCÍCIO 11: Pesquisar elemento e retornar posição
    public int pesquisar(int valor) {
        Nodo atual = primeiro;
        int posicao = 0;
        while (atual != null) {
            if (atual.valor == valor) {
                return posicao;
            }
            atual = atual.proximo;
            posicao++;
        }
        return -1; // Não encontrou
    }

    // EXERCÍCIO 9: Remover elemento específico
    public void removerElemento(int valor) {
        int posicao = pesquisar(valor);
        if (posicao != -1) {
            removerNaPosicao(posicao);
        } else {
            System.out.println("Elemento " + valor + " não encontrado para remoção.");
        }
    }
}
