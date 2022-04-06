package exercicioobj;
public class Aluno {
    
    String nome;
    String email;
    int idade;
    int ra;
    boolean deMaior;
    
    void verificaMaior ()
    {
        if(idade>=18)
            deMaior = true;
        else
            deMaior = false;
    }
    
    
    
}
