public class ListaEncadeada {
    
    // Atributos privados para garantir o encapsulamento
    private int[] dados;        // O arranjo que armazena os elementos [cite: 311]
    private int tamanhoAtual;   // Contador de quantos elementos reais existem na lista [cite: 403]
    private int capacidade;    // Tamanho máximo definido na criação

    // EXERCÍCIO 2: Método para criar uma lista vazia (Construtor)
    public ListaEncadeada(int capacidadeMaxima) {
        this.capacidade = capacidadeMaxima;
        this.dados = new int[capacidade]; // Alocação de memória para o vetor [cite: 318, 356]
        this.tamanhoAtual = 0;           // A lista nasce sem nenhum elemento
    }

    // EXERCÍCIO 12: Retornar o número de elementos existentes
    public int obterTamanho() {
        return this.tamanhoAtual;
    }

    // EXERCÍCIO 10: Exibir o conteúdo da lista
    public void exibirLista() {
        if (tamanhoAtual == 0) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.print("Conteúdo da Lista: ");
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.print(dados[i] + " "); // Acesso via índice [cite: 312]
        }
        System.out.println();
    }

    // EXERCÍCIO 4: Inserir no fim da lista
    public void inserirNoFim(int elemento) {
        if (tamanhoAtual < capacidade) {
            dados[tamanhoAtual] = elemento;
            tamanhoAtual++;
        } else {
            System.out.println("Erro: Lista cheia!");
        }
    }

    // EXERCÍCIO 3: Inserir no início da lista
    public void inserirNoInicio(int elemento) {
        if (tamanhoAtual < capacidade) {
            // Para inserir no início de um vetor, precisamos "empurrar" todos para a direita
            for (int i = tamanhoAtual; i > 0; i--) {
                dados[i] = dados[i - 1];
            }
            dados[0] = elemento;
            tamanhoAtual++;
        } else {
            System.out.println("Erro: Lista cheia!");
        }
    }

    // EXERCÍCIO 5: Inserir em uma posição específica
    public void inserirNaPosicao(int elemento, int posicao) {
        if (tamanhoAtual < capacidade && posicao >= 0 && posicao <= tamanhoAtual) {
            // Desloca os elementos a partir da posição desejada para a direita
            for (int i = tamanhoAtual; i > posicao; i--) {
                dados[i] = dados[i - 1];
            }
            dados[posicao] = elemento;
            tamanhoAtual++;
        } else {
            System.out.println("Erro: Posição inválida ou lista cheia.");
        }
    }

    // EXERCÍCIO 6: Remover no início
    public void removerNoInicio() {
        if (tamanhoAtual > 0) {
            // "Puxa" todos os elementos para a esquerda, sobrescrevendo o primeiro
            for (int i = 0; i < tamanhoAtual - 1; i++) {
                dados[i] = dados[i + 1];
            }
            tamanhoAtual--;
        } else {
            System.out.println("Erro: Lista já está vazia.");
        }
    }

    // EXERCÍCIO 7: Remover no fim
    public void removerNoFim() {
        if (tamanhoAtual > 0) {
            // Basta diminuir o contador. O Java ignora o que sobrar no vetor original.
            tamanhoAtual--;
        } else {
            System.out.println("Erro: Lista já está vazia.");
        }
    }

    // EXERCÍCIO 8: Remover em posição específica
    public void removerNaPosicao(int posicao) {
        if (posicao >= 0 && posicao < tamanhoAtual) {
            for (int i = posicao; i < tamanhoAtual - 1; i++) {
                dados[i] = dados[i + 1];
            }
            tamanhoAtual--;
        } else {
            System.out.println("Erro: Posição inválida.");
        }
    }

    // EXERCÍCIO 11: Pesquisar elemento e retornar posição
    public int pesquisar(int elemento) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (dados[i] == elemento) {
                return i; // Retorna o índice onde foi encontrado
            }
        }
        return -1; // Retorna -1 caso não exista na lista
    }

    // EXERCÍCIO 9: Remover elemento específico
    public void removerElemento(int elemento) {
        int posicao = pesquisar(elemento);
        if (posicao != -1) {
            removerNaPosicao(posicao);
        } else {
            System.out.println("Elemento não encontrado para remoção.");
        }
    }

}
