
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Sarah",21); // Criação do construtor

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setNome("Sarah Motta");
        pessoa.setIdade(25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.fazerAniversario();
        pessoa.fazerAniversario();
        pessoa.fazerAniversario();
        pessoa.fazerAniversario();

        System.out.println("Após esses aniversários "+ pessoa.getNome() + " ficou com "+ pessoa.getIdade() + " anos de idade");
    }
}