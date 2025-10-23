
public class Circulo {

    private double raio;  // Atributo private


     public double calculoAreaC () {  // Método
        return (Math.PI * (raio * raio));

    }

    public double calculoPeriC () { // Método
        return 2 * Math.PI * raio;
    }

    public void setRaio(double raio) { // Método set para conseguir acessar e alterar o atributo privado
        this.raio = raio;  // referenciando o atributo que será alterado
    }




    //π * raio^2 -> Area
    //2 * π * raio -> Perimetro

}
