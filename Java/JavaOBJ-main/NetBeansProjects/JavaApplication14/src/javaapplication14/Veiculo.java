package javaapplication14;

public class Veiculo {
    
    String modelo;
    String marca;
    int placa;
    String cor;
    float motor;
    int ano;
    boolean escada;
    
    void andar ()
    {
        System.out.println("Andando");
        
    }
    
    void sairDaFrente()
    {
        if(escada==true)
            System.out.println("Sair da frente");    
    }  
}