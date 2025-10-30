public abstract class Funcionario { // classe abstrata
    protected final double SALARIO_BASE = 1518.0; // Constante: Boa prática -> Nomear com todas as letras em maiúsculo
    protected int id;
    protected String cpf;
    protected String nome;
    protected double salario; // Foi tirado as variaveis salario das classes gerente e secretaria e colocado na Super classe Funcionário


    public Funcionario (int id, String cpf, String nome, double multiplicador) { // Construtor pode ser criado em uma classe abstrata
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = SALARIO_BASE * multiplicador;
}

    /*public double calcularSalario(){ -> Esse método não se faz mais necessário pois colocamos ele na SuperClasse Funcionario
        return SALARIO_BASE;
    }*/

    public double getSalario() {
        return salario;

    }

    public abstract void imprimirCargo(); // Método abstrato é obrigado a ser implementado nas classes que referencia a SuperClasse abstrata

}
