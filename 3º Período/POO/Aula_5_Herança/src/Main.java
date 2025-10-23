/* Criar 3 classses: Funcionário, Gerente e Secretaria

 * Funcionário será a Superclasse e terá o atributo salarioBase = 1518
 * Gerente será subclasse de Funcionário e receberá 3 salarioBase
 * Secretária também será subclassse, mas receberá 2 salariosBase */

public class Main {
    public static void main(String[] args) throws Exception {
        
        Gerente gerente1 = new Gerente (1, "11111111111", "Arthur");
        System.out.println(gerente1.calcularSalario());
    }
}
