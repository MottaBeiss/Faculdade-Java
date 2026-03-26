package Estrutura_de_Dados.List3;

public class Nodo {
    int valor;      // O dado armazenado
    Nodo proximo;   // A referência (seta) para a próxima "caixa" na memória

    // Construtor do Nodo
    public Nodo(int valor) {
        this.valor = valor;
        this.proximo = null; // Quando nasce, ele ainda não aponta para ninguém
    }
}
