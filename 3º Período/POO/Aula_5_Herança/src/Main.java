/* Criar 3 classses: Funcionário, Gerente e Secretaria

 * Funcionário será a Superclasse e terá o atributo salarioBase = 1518
 * Gerente será subclasse de Funcionário e receberá 3 salarioBase
 * Secretária também será subclassse, mas receberá 2 salariosBase */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Gerente gerente1 = new Gerente (1, "11111111111", "Arthur");
        System.out.println(gerente1.calcularSalario());

        Funcionario funcionario = new Funcionario(2, "22222222222", "Rebeca");
        System.out.println(funcionario.calcularSalario());

        Secretaria secretaria = new Secretaria(3, "33333333333","Joana");
        System.out.println(secretaria.calcularSalario());


        ArrayList<Funcionario> funcionarios = new ArrayList<>(); // Polimorfismo
        funcionarios.add(gerente1);
        funcionarios.add(secretaria);
        funcionarios.add(funcionario);
        
        double salarioTotal = 0.0;

        for(Funcionario f: funcionarios){
            salarioTotal += f.calcularSalario();
        }

        System.out.println("Soma dos salários: " + salarioTotal);

    }
}
