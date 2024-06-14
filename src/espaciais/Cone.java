package espaciais;

public class Cone {
    public double raio;
    public double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    public double calcularVolume(){
        return  Math.sqrt(1/3) * Math.pow(raio,2) * altura;
    }
    public double areaSuperficial(){
        return  Math.PI * raio * Math.sqrt( Math.pow(raio,2) * Math.pow(altura,2)) ;
    }
    public void informaCalculo(int formato){
        if (formato % 2 == 0){
            System.out.printf("\nO VOLUME DO CONE É: %.2f", calcularVolume());
            System.out.printf("\nA  ÁREA SPERFICIAL DO CONE É: %.2f", areaSuperficial());
        }else{
            System.out.printf("\no volume do cone é: %.2f",calcularVolume());
            System.out.printf("\na área superficial do  cone é: %.2f",areaSuperficial());
        }

    }
}
