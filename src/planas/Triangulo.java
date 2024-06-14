package planas;

public class Triangulo {
    public double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }
    public double calcularArea(){
        return lado * Math.sqrt(3/4);
    }
    public double calcularPerimetro(){
        return lado * 3;
    }
    public void informaCalculo(int formato){
        if (formato % 2 == 0){
            System.out.printf("\nA ÁREA DO TRIÂNGULO É: %.2f", calcularArea());
            System.out.printf("\nO PERIMETRO DO TRIÂNGULO É: %.2f", calcularPerimetro());
        }else{
            System.out.printf("\na érea do triângulo é: %.2f",calcularArea());
            System.out.printf("\no perimetro do triângulo é: %.2f",calcularPerimetro());
        }

    }
}
