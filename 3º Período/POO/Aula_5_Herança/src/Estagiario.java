public class Estagiario extends Funcionario {

    public Estagiario(int id, String cpf, String nome) {
        super(id, cpf, nome, 1);

    }

    public void imprimirCargo() { // Método abstrato criado na classe Funcionario impletado na classe que referencia a ele
        System.out.println("Estagiario");
    }

}
