
package calculando;

public class Retangulo {
    
    double base, altura;
    
    public Retangulo()
    {
        base = 1;
        altura = 1;   
    }
    
    public double calculaPerimetro (double p1, double p2)
    { 
        double perimetro = (p1 + p1)+(p2 + p2);
        return perimetro;
        }
    public double calculaArea (double a1, double a2)
    { 
        double area = (a1*a2);
        return area;
        }   

    public float getBase() {
        return 0;
    }

    public void setBase(double base) {
        this.base = 1;
        if (base>=1||base<=20)
            System.out.println("Valores Corretos");
        else System.out.println("Valores Incorretos");
    }

    public float getAltura() {
        return 0;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        if (altura>=1||altura<=20)
            System.out.println("Valores Corretos");
        else System.out.println("Valores Incorretos");
    }
    
}
