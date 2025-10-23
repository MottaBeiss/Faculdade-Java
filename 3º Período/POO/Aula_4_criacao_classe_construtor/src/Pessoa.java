public class Pessoa {

    private String nome; // Construtor altera os valores dessas variáveis (Atributos do objeto)
    private int idade;


    public Pessoa(String nome, int idade) { //Criação do construtor
        this.nome = nome;
        this.idade = idade;

    }

    //Tudo método

    public String getNome() { // Método de acesso para obter um valor
        return nome;
    }

    public void setNome(String nome) { // Método de acesso para alterar um valor
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniversario() { // Método de ação para somar a idade após fazer aniversário
        idade++;

    }
}
