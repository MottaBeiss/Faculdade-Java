public class Main20 {
    public static void main(String[] args) {

        // 1. Crie 2 objetos da classe Pessoa, usando o construtor
        System.out.println(">> Criando duas pessoas...");
        Pessoa20 pessoa1 = new Pessoa20("Ana Silva", "(31) 99876-5432", "ana.silva@email.com");
        Pessoa20 pessoa2 = new Pessoa20("Carlos Souza", "(21) 98765-4321", "carlos.souza@email.com");

        // 2. Imprima os atributos iniciais de cada objeto
        System.out.println("\n>> Mostrando dados iniciais:");
        pessoa1.imprimirDados();
        pessoa2.imprimirDados();

        // 3. Altere os valores de alguns atributos usando os métodos "set"
        System.out.println(">> Alterando o e-mail da Ana e o telefone do Carlos...");
        pessoa1.setEmail("ana.s.rocha@novoemail.com"); // Altera o e-mail da pessoa1
        pessoa2.setTelefone("(11) 95555-4444");      // Altera o telefone da pessoa2

        // 4. Imprima os atributos novamente para ver as alterações
        System.out.println("\n>> Mostrando dados após a alteração:");
        pessoa1.imprimirDados();
        pessoa2.imprimirDados();
    }
}
