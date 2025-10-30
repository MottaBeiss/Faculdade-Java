public class Secretaria extends Funcionario {

    //private double salario;

    public Secretaria(int id, String cpf, String nome) {
        super(id, cpf, nome, 2); // super está referenciando ao construtor da Superclasse
    }

    public void imprimirCargo() {
        System.out.println("Secretária");
    }

    /*public double calcularSalario (){
        salario = SALARIO_BASE * 2;
        return salario;
    }*/

}
