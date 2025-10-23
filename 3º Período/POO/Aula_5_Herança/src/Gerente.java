public class Gerente extends Funcionario {

    private double salario;

    public Gerente (int id, String cpf, String nome) {
        super(id, cpf, nome);
    }

    public double calcularSalario (){
        salario = SALARIO_BASE * 3;
        return salario;
    }



}
