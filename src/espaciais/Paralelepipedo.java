package espaciais;

public class Paralelepipedo {
    public double comprimento;
    public double altura;
    public double largura;

    public Paralelepipedo(double comprmento, double altura, double largura) {
        this.comprimento = comprmento;
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularVolume(){
        return comprimento * altura + largura;
    }
    public double areaSuperficial(){
        return 2 * ((comprimento * altura) + (altura * largura) + (comprimento * largura));
    }
    public void informaCalculo(int formato){
        if (formato % 2 == 0){
            System.out.printf("\nO VOLUME DO PARALELEPIPEDO É: %.2f", calcularVolume());
            System.out.printf("\nA  ÁREA SPERFICIAL DO PARALELEPIPEDO É: %.2f", areaSuperficial());
        }else{
            System.out.printf("\no volume do paralelelpipedo é: %.2f",calcularVolume());
            System.out.printf("\na área superficial do paralelelpipedo é: %.2f",areaSuperficial());
        }

    }
}

