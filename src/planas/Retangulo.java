package planas;

public class Retangulo {
    public double base;
    public double altura;
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return (2*base) + (2*altura);
    }
    public void informaCalculo(int formato){
        if (formato % 2 == 0){
            System.out.printf("\nA ÁREA DO RETÂNGULO É: %.2f", calcularArea());
            System.out.printf("\nO PERIMETRO DO RETÂNGULO É: %.2f", calcularPerimetro());
        }else{
            System.out.printf("\na érea do retângulo é: %.2f",calcularArea());
            System.out.printf("\no perimetro do retângulo é: %.2f",calcularPerimetro());
        }

    }
}

