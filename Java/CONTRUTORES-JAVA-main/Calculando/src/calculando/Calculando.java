package calculando;

public class Calculando {

    public static void main(String[] args) {
       
        Retangulo ret1 = new Retangulo();
        
        double perimetro = ret1.calculaPerimetro(2, 5);
        System.out.println("Perimetro: "+perimetro);
        
        double area = ret1.calculaArea(5, 5);
        System.out.println("Área: "+area);
    }
    }
