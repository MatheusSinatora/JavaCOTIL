package funcionario;

public class ClasseFunc {
    
    private String nome;
    private String sobrenome;
    private float salMen;
    private float salAnual;
    private float salFinal;
    
    public ClasseFunc(String nome, String sobrenome, float salMen)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        
        if(salMen < 0)
            this.salMen = 0;
        else
            this.salMen = salMen;
        
    }
    
    public ClasseFunc()
    {
        nome = "";
        sobrenome = "";
        salMen = 0f;
    }
    
    public float getSalAnual() {
        salAnual = salMen * 12;
        return salAnual;
    }

    public void setSalAnual(float salAnual) {
        salFinal = (float) (salAnual * 1.10);
        this.salAnual = salAnual;
    }

    public float getSalFinal() {
        salFinal = (float) (salAnual * 1.10);
        return salFinal;
    }

    public void setSalFinal(float salFinal) {
        this.salFinal = salFinal;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalMen() {
        return salMen;
    }

    public void setSalMen(float salMen) {
         if(salMen < 0)
            this.salMen = 0;
        else
            this.salMen = salMen;
        
    } 
    
}
