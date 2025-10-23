import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Circulo Circulo = new Circulo(); // Objeto
        Circulo.setRaio(5); // set referenciando ao atributo 'raio' e alterando o seu valor

        System.out.println("\nCalculos do circulo:");
        System.out.println("Área: " + Circulo.calculoAreaC());
        System.out.println("Perímetro: " + Circulo.calculoPeriC());
        
        System.out.println("");
        
        Retangulo Retangulo = new Retangulo(5,7); // Objeto criado referenciando ao construtor e atribuindo valore aos atributos

        System.out.println("Calculos do retangulo:");
        System.out.println("Área: " + Retangulo.calculoAreaR());
        System.out.println("Perímetro: " + Retangulo.calculoPeriR());

        System.out.println("");

    sc.close();        
    }

}
