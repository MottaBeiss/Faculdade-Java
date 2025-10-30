/* Criar 3 classses: Funcionário, Gerente e Secretaria

 * Funcionário será a Superclasse e terá o atributo salarioBase = 1518
 * Gerente será subclasse de Funcionário e receberá 3 salarioBase
 * Secretária também será subclassse, mas receberá 2 salariosBase */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Gerente gerente1 = new Gerente (1, "11111111111", "Arthur");
        //System.out.println(gerente1.getSalario());

        /*Funcionario funcionario = new Funcionario(2, "22222222222", "Rebeca", 1); -> Depois que colocamos Funcionario como uma classe abstrata, não se pode ter um objeto <-
        System.out.println(funcionario.getSalario());*/ 

        Estagiario estagiario = new Estagiario(2,"22222222222", "Rebeca");

        Secretaria secretaria = new Secretaria(3, "33333333333","Joana");
        //System.out.println(secretaria.getSalario());

        System.out.println();

        ArrayList<Funcionario> funcionarios = new ArrayList<>(); // Exemplo de Polimorfismo -> Quando um objeto pode assumir variadas formas
        funcionarios.add(gerente1);
        funcionarios.add(secretaria);
        //funcionarios.add(funcionario);
        funcionarios.add(estagiario);
        
        double salarioTotal = 0.0;

        for(Funcionario f: funcionarios){
            System.out.println(f.nome);
            f.imprimirCargo();

            System.out.println();

            salarioTotal += f.getSalario();
        }

        System.out.println("\nSoma dos salários: " + salarioTotal);
        System.out.println();

    }
}
