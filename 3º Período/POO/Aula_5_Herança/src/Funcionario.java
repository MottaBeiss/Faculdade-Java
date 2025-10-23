public class Funcionario {
    protected final double SALARIO_BASE = 1518.0; // Constante: Boa prática -> Nomear tudo em letra maiúscula
    protected int id;
    protected String cpf;
    protected String nome;

public Funcionario (int id, String cpf, String nome) {
    this.id = id;
    this.cpf = cpf;
    this.nome = nome;
}

    public double calcularSalario(){
        return SALARIO_BASE;
    }

}
