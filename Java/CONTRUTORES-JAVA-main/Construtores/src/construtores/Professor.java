
package construtores;

public class Professor {
    
    private int idade;
    private String nome;
    private String disciplina;
    
    public Professor(int idade, String nome, String disciplina)
    {
        this.idade = idade;
        this.nome = nome;  
        this.disciplina = disciplina;
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
}
