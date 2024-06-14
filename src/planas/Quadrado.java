package planas;

public class Quadrado {
    private double lado;
    public  Quadrado(double lado){

        this.lado = lado;
    }
    public double calcularArea (){

        return lado * lado;
    }
    public double calcularPerimetro(){

        return 4 * lado;
    }
    public void informaCalculo(int formato){
    if (formato % 2 == 0){
        System.out.printf("\nA ÁREA DO QUADRADO É: %.2f", calcularArea());
        System.out.printf("\nO PERIMETRO DO QUADRADO É: %.2f", calcularPerimetro());
    }else{
        System.out.printf("\na érea do quadrado é: %.2f",calcularArea());
        System.out.printf("\no perimetro do quadrado é: %.2f",calcularPerimetro());
    }

    }
}
