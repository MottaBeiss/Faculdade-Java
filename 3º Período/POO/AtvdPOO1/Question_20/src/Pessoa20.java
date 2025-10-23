public class Pessoa20 {

     // 1. Atributos privados (só a própria classe pode acessá-los diretamente)
    private String nome;
    private String telefone;
    private String email;

    // 2. Construtor: um método especial para criar objetos desta classe
    // Ele recebe os valores iniciais e os atribui aos atributos.
    public Pessoa20(String nomeInicial, String telefoneInicial, String emailInicial) {
        this.nome = nomeInicial;
        this.telefone = telefoneInicial;
        this.email = emailInicial;
    }

    // 3. Métodos para alterar os valores (Setters)
    // Cada método é público e altera um atributo específico.
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    // 4. Método para imprimir os dados do objeto
    public void imprimirDados() {
        System.out.println("--- Dados ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + this.email);
        System.out.println("-----------------------\n"); 
    }

}
