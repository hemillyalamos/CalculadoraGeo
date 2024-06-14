package espaciais;

public class Cubo {
    public double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }
    public double calcularVolume(){

        return  Math.pow(lado,3);
    }
    public double areaSuperficial(){

        return Math.pow(lado,2) * 6;
    }
    public void informaCalculo(int formato){

        if (formato % 2 == 0){
            System.out.printf("\nO VOLUME DO CUBO É: %.2f", calcularVolume());
            System.out.printf("\nA  ÁREA SPERFICIAL DO CUBO É: %.2f", areaSuperficial());
        }else{
            System.out.printf("\no volume do cubo é: %.2f",calcularVolume());
            System.out.printf("\na área superficial do  cubo é: %.2f",areaSuperficial());
        }

    }
}
