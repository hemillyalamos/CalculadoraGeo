package planas;

public class Circulo {
    private  double raio;

    public  Circulo (double raio) {

        this.raio = raio;
    }
    public double calcularArea() {

        return Math.PI *raio * raio;
    }
    public double calcularPerimetro(){
        return 2 + Math.PI * raio;

    }
    public void informaCalculo ( int formato){
        if (formato % 2 == 0) {
            System.out.printf("\nA ÁREA DO CIRCULO É: %.2f", calcularArea());
            System.out.printf("\nO PERIMETRO DO CIRCULO É: %.2f", calcularPerimetro());
        } else {
            System.out.printf("\na área do circulo é: %.2f", calcularArea());
            System.out.printf("\no perimetro do circulo é: %.2f", calcularPerimetro());
        }


    }
}
