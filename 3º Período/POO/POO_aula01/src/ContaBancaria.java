import javax.swing.*;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) { // Construtor
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
         JOptionPane.showMessageDialog(null,"Titular: "+nomeTitular+"\n" +
                                                                      ""+"Conta: "+numeroConta+"\n" +
                                                                    "Saldo: R$ "+saldo);
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

    }



