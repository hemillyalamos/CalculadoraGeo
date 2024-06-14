package espaciais;

public class Piramide {
    public double arestaDaBase;
    public double apotema;
    public double altura;

    public Piramide(double arestaDaBase, double apotema, double altura) {
        this.arestaDaBase = arestaDaBase;
        this.apotema = apotema;
        this.altura = altura;
    }

    public double calcularVolume(){

        return (arestaDaBase * altura)/3;
    }
    public double areaSuperficial(){

        return (2 * arestaDaBase * apotema) + Math.pow(arestaDaBase,2);
    }
    public void informaCalculo(int formato){
        if (formato % 2 == 0){
            System.out.printf("\nO VOLUME DA PIRÂMIDE DE BASE QUADRADA É: %.2f", calcularVolume());
            System.out.printf("\nA  ÁREA SPERFICIAL DA PIRÂMIDE DE BASE QUADRADA É: %.2f", areaSuperficial());
        }else{
            System.out.printf("\no volume da pirâmide de base quadrada é: %.2f",calcularVolume());
            System.out.printf("\na área superficial da pirâmide de base quadrada é: %.2f",areaSuperficial());
        }

    }
}
