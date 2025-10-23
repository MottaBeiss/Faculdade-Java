import javax.swing.JOptionPane;

public class Main19 {
    public static void main(String[] args) {

         int numConta = Integer.parseInt( // JOptionPane é feito para receber String, como vamos fazer ele receber 
                                        //  um inteiro, precisamos prepara-ló/avisal-o que receberá um valor desse tipo   
        JOptionPane.showInputDialog("Informe a conta:"));

        String titularConta = JOptionPane.showInputDialog("Informe o nome:"); // JOptionPane é feito para receber String

        double saldo = Double.parseDouble( // Preparando para receber um double
                JOptionPane.showInputDialog("Informe o saldo inicial:"));

        Conta_Bancaria conta = new Conta_Bancaria(numConta, titularConta, saldo); // Objeto para chamar o construtor da clase Conta_Bancaria

        conta.mostrarSaldo(); // Chamando o método mostrarSaldo dentro da classe Conta_Bancaria

        double valorDeposito = Double.parseDouble( // Preparando para receber um double
                JOptionPane.showInputDialog("Informe o valor do deposito:")); 

        conta.depositar(valorDeposito); // Chamando o método depositar
        conta.mostrarSaldo(); // Chamando o método mostrarSaldo novamente depois de depositar
        
        double valorSaque = Double.parseDouble( // Preparando para receber um double
                JOptionPane.showInputDialog("Informe o valor do saque:")); 

        conta.sacar(valorSaque); // Chamando o método sacar
        conta.mostrarSaldo(); // Chamando o método mostrarSaldo novamente depois de sacar


    }
}
