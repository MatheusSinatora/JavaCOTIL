
package javaapplication14;

public class Cliente {
    //atributos
    String nome;
    int idade;
    float altura;
    float peso;
    boolean deMaior;
    
    //métodos
    void verificaMaior ()
    {
        if(idade>=18)
            deMaior = true;
        else
            deMaior = false;
    }
    
    
    
}
