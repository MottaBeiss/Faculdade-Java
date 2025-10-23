
public class Retangulo {

    // Atributos
    private double base;
    private double altura;

    // Construtor
    public Retangulo(double base, double altura) { 
        
        // Aqui é obrigatório ter pois o JAVA pode se confundir com os valores dos parâmetros do método
        this.base = base;
        this.altura = altura;
    }

    //Métodos
    public double calculoAreaR () {
        return this.base * this.altura;
        // this. dentro do método (sem parâmetro) é uma boa prática para o JAVA saber que você quer que ele pegue esses valores do atributo do objeto
}   

    public double calculoPeriR () {
        return 2 * (base + altura);
    // Mas não é obrigatório porque o método não tem parâmetro, então ele não irá se confundir

}   
    //public void setBase ()

    // base x altura -> area
    // soma de todos os lados -> perimetro

}