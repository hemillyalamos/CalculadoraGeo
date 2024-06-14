package espaciais;

public class Cilindro {
    public double altura;
    public double raio;

    public Cilindro(double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }

    public double calcularVolume(){
        return Math.PI * Math.pow(raio,2);
    }
    public double areaSuperficial(){
        return (2 * Math.PI * altura) + (2 * Math.PI * Math.pow(raio,2));
    }
    public void informaCalculo(int formato){
        if (formato % 2 == 0){
            System.out.printf("\nO VOLUME DO CILINDRO É: %.2f", calcularVolume());
            System.out.printf("\nA  ÁREA SPERFICIAL DO CILINDRO É: %.2f", areaSuperficial());
        }else{
            System.out.printf("\no volume do  cilindro é: %.2f",calcularVolume());
            System.out.printf("\na área superficial do  cilindro é: %.2f",areaSuperficial());
        }

    }
}

