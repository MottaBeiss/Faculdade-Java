public class Escola_Main21 {
    public static void main(String[] args)  {
        
        // --- Teste com Aluno 1 (será Aprovado) ---
        System.out.println("--- Criando Aluno 1 ---");
        Aluno aluno1 = new Aluno(123, "111.111.111-11", "João da Silva");

        // Definindo as notas e faltas do Aluno 1
        double[] notasJoao = {85.0, 92.5, 78.0, 95.0};
        int[] faltasJoao = {1, 3, 0, 2};
        aluno1.setNotasFinais(notasJoao);
        aluno1.setFaltas(faltasJoao);

        // Exibindo os resultados do Aluno 1
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Média Final: " + aluno1.calcularMedia());
        System.out.println("Situação: " + aluno1.calcularSituacao());
        System.out.println("-------------------------");


        // --- Teste com Aluno 2 (será Reprovado por Nota) ---
        System.out.println("\n--- Criando Aluno 2 ---");
        Aluno aluno2 = new Aluno(456, "222.222.222-22", "Maria Oliveira");

        // Definindo as notas e faltas da Aluna 2 (uma nota é 59.0)
        double[] notasMaria = {70.0, 59.0, 88.0, 91.0};
        int[] faltasMaria = {2, 1, 3, 0};
        aluno2.setNotasFinais(notasMaria);
        aluno2.setFaltas(faltasMaria);

        // Exibindo os resultados da Aluna 2
        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Média Final: " + aluno2.calcularMedia());
        System.out.println("Situação: " + aluno2.calcularSituacao());
        System.out.println("-------------------------");


        // --- Teste com Aluno 3 (será Reprovado por Faltas) ---
        System.out.println("\n--- Criando Aluno 3 ---");
        Aluno aluno3 = new Aluno(789, "333.333.333-33", "Pedro Martins");

        // Definindo as notas e faltas do Aluno 3 (uma disciplina tem 5 faltas)
        double[] notasPedro = {90.0, 95.0, 88.0, 91.0};
        int[] faltasPedro = {2, 1, 5, 0};
        aluno3.setNotasFinais(notasPedro);
        aluno3.setFaltas(faltasPedro);

        // Exibindo os resultados do Aluno 3
        System.out.println("Aluno: " + aluno3.getNome());
        System.out.println("Média Final: " + aluno3.calcularMedia());
        System.out.println("Situação: " + aluno3.calcularSituacao());
        System.out.println("-------------------------");

    }
}
