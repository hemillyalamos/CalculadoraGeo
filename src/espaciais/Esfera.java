package espaciais;

public class Esfera {
    public double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }
    public double calcularVolume(){
        return  Math.sqrt(4/3) * Math.pow(raio,3);
    }
    public double areaSuperficial(){
        return Math.PI*4;
    }
    public void informaCalculo(int formato){
        if (formato % 2 == 0){
            System.out.printf("\nO VOLUME DA ESFERA É: %.2f", calcularVolume());
            System.out.printf("\nA  ÁREA SUPERFICIAL DA ESFERA É: %.2f", areaSuperficial());
        }else{
            System.out.printf("\no volume da esfera é: %.2f",calcularVolume());
            System.out.printf("\na área superficial da esfera é: %.2f",areaSuperficial());
        }

    }
}
