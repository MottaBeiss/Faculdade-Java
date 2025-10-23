public class Aluno {

    // 1. Atributos privados
    private int registroAcademico;
    private String CPF;
    private String nome;
    private double[] notasFinais; // Vetor para 4 notas
    private int[] faltas;         // Vetor para 4 contagens de faltas

    // 2. Construtor
    // Recebe os dados básicos do aluno ao criar o objeto.
    // E já prepara os vetores de notas e faltas com 4 posições vazias.
    public Aluno(int ra, String cpf, String nome) {
        this.registroAcademico = ra;
        this.CPF = cpf;
        this.nome = nome;
        this.notasFinais = new double[4]; // Cria o vetor com 4 espaços
        this.faltas = new int[4];         // Cria o vetor com 4 espaços
    }

    // 3. Métodos Getters e Setters
    // Getters para ler informações
    public String getNome() {
        return this.nome;
    }

    // Setters para definir as notas e faltas do aluno.
    // Recebem um vetor completo e o atribuem ao aluno.
    public void setNotasFinais(double[] novasNotas) {
        this.notasFinais = novasNotas;
    }

    public void setFaltas(int[] novasFaltas) {
        this.faltas = novasFaltas;
    }

    // 4. Métodos de Lógica de Negócio
    /**
     * Calcula a média aritmética das 4 notas do aluno.
     * @return A média final do aluno.
     */
    public double calcularMedia() {
        double soma = 0;
        for (double nota : this.notasFinais) {
            soma += nota;
        }
        return soma / 4;
    }

    /**
     * Verifica se o aluno foi aprovado ou reprovado.
     * Critérios: Todas as notas > 60 E Todas as faltas < 5.
     * @return A String "Aprovado" ou "Reprovado".
     */
    public String calcularSituacao() {
        // Verifica o critério das notas
        for (double nota : this.notasFinais) {
            if (nota <= 60) {
                return "Reprovado (Nota Baixa)"; // Se encontrar uma nota baixa, já retorna e para.
            }
        }

        // Verifica o critério das faltas
        for (int falta : this.faltas) {
            if (falta >= 5) {
                return "Reprovado (Excesso de Faltas)"; // Se encontrar excesso de faltas, já retorna e para.
            }
        }

        // Se passou por todas as verificações sem retornar, o aluno está aprovado.
        return "Aprovado";
    }
}
