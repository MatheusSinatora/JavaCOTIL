package constpessoa;

public class Pessoa {
    
    private int idade;
    private int dia;
    private int mes;
    private int anoNasc;
    private String nome; 
    private int calculaId;

    public Pessoa(int idade, int dia, int mes, int anoNasc, String nome)
    {
        this.idade = idade;
        this.dia = dia;
        this.mes = mes;
        this.anoNasc = anoNasc;
        this.nome = nome;   
    }
    
    public void calculaIdade(){
        calculaId = anoNasc - 2022;
    }
    public void informaIdade(){
        this.calculaId = calculaId;
    }
    public void informaNome(){
        this.nome = nome;
    }
}