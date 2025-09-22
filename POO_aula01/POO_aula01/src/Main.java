import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Aula 2 10/09/25 POO
        int numeroConta = Integer.parseInt(
                JOptionPane.showInputDialog("Informe a conta:"));
        String nome = JOptionPane.showInputDialog("Informe o nome:");
        double saldo = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o saldo inicial:"));

        ContaBancaria conta = new ContaBancaria(numeroConta, nome, saldo);
        conta.mostrarSaldo();

        double valorDeposito = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o valor do deposito:"));

        conta.depositar (valorDeposito);
        conta.mostrarSaldo();
        double valorSaque = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o valor do saque:"));

        conta.sacar(valorSaque);
        conta.mostrarSaldo();


        //Aula 1 03/09/25 POO
        ContaBancaria conta1 = new ContaBancaria(001,"Arthur",1000);

        ContaBancaria conta2 = new ContaBancaria(002,"Mariana",4000);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta1.depositar(500);
        conta1.mostrarSaldo();

    }
}