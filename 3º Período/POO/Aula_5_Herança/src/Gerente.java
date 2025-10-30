public class Gerente extends Funcionario { // extends = Herança

    //private double salario;

    public Gerente (int id, String cpf, String nome) {
        super(id, cpf, nome, 3);
    }

    public void imprimirCargo() {
        System.out.println("Gerente");
    }


    /*public double calcularSalario (){
        salario = SALARIO_BASE * 3;
        return salario;
    }*/



}
