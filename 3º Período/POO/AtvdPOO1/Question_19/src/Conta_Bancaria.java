import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Conta_Bancaria {

    private int numConta;
    private String titularConta;
    private double saldo;

    public Conta_Bancaria(int numConta, String titularConta, double saldo) { // Construtor
        this.numConta = numConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    // Métodos comum
    public void mostrarSaldo() { 
        
        // Chamando o método que formata o nome para obter o resultado.
        String nomeNoCartao = this.getNomeFormatadoCartao();

        JOptionPane.showMessageDialog(null,"Titular: "+this.titularConta+"\n" +
                                                                      ""+"Conta: "+this.numConta+"\n" +
                                                                    "Saldo: R$ "+this.saldo + "\n\n" +
                                                                    "Nome no cartão: " + nomeNoCartao);
        }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
        }

    public void sacar (double valorSaque) {
        if(valorSaque <= saldo)
            saldo -= valorSaque;
        else JOptionPane.showConfirmDialog(null,
                "Saldo insuficiente");
        }

    public String getNomeFormatadoCartao() {
    // Definindo a lista de preposições a serem ignoradas (em minúsculas).
    List<String> preposicoes = Arrays.asList("de", "da", "das", "do", "dos", "e");

    // Passo 1: Quebrando o nome completo em palavras, usando o espaço como divisor.

    // Dizendo para o método .split da classe String que o delimitador para separar é o 'espaço' entre as palavras
    String[] palavras = this.titularConta.trim().split("\\s+"); // .trim() remove espaços no início/fim 
                                                              // \\s+ lida com múltiplos espaços
    // .split: Cria um vetor e usa as palavras de um texto para preenche-lo

    // Passo 2: Filtrando as preposições, criando uma nova lista apenas com nomes/sobrenomes válidos.
    List<String> nomesValidos = new ArrayList<>();
    for (String palavra : palavras) {
        // A verificação é feita em minúsculas para ignorar "De", "DA", "dos", etc.
        if (!preposicoes.contains(palavra.toLowerCase())) {
            nomesValidos.add(palavra);
        }
    }

    // Se a lista de nomes válidos estiver vazia (ex: nome era "De Dos"), retorna uma string vazia.
    if (nomesValidos.isEmpty()) {
        return "";
    }

    // Se houver apenas um nome válido (ex: "Cher"), retorna ele em maiúsculas.
    if (nomesValidos.size() == 1) {
        return nomesValidos.get(0).toUpperCase();
    }

    // Passo 3: Monta a string final usando um StringBuilder para melhor performance.
    String nomeFormatado = "";
    int totalNomes = nomesValidos.size();

    for (int i = 0; i < totalNomes; i++) {
        String nomeAtual = nomesValidos.get(i);

        if (i == 0) {
            // Regra 1: O primeiro nome é sempre completo e em maiúsculas.
            nomeFormatado += (nomeAtual.toUpperCase());
        } else if (i == totalNomes - 1) {
            // Regra 2: O último nome é sempre completo e em maiúsculas.
            nomeFormatado += (nomeAtual.toUpperCase());
        } else {
            // Regra 3: Os nomes do meio são abreviados.
            nomeFormatado += nomeAtual.substring(0, 1).toUpperCase() + ".";
        }

        // Adiciona um espaço depois de cada parte, exceto a última.
        if (i < totalNomes - 1) {
            nomeFormatado += " ";
        }
    }

    // Passo 4: Retorna a string final construída.
    return nomeFormatado;
}

}
