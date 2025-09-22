/*@author Patrick Moreira Motta - 12127245
 @version 1.00 2025/3/28
 */

public class Questao7 {
    public static void main (String[]args) {

    int umaLatapinta = 15;
    int latas = 60 / umaLatapinta;
    double custo = 50.0 * latas;

    System.out.println("A quantidade necessária de latas de tinta será de "+latas+" latas.");
    System.out.print("O custo para pintar seis cômodos de 10m² será de R$"+custo);

    }
}
