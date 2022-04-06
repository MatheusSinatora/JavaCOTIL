package exercicioobj;

public class ExercicioObj {
    public static void main(String[] args) {
        
        
      Aluno aluno1 = new Aluno ();
      aluno1.nome = "Paulo Plinio";
      aluno1.email = "paulop10@gmail.com";
      aluno1.idade = 16;
      aluno1.ra = 201560;
      aluno1.deMaior = false;
      aluno1.verificaMaior();
      
      Disciplina disc1 = new Disciplina ();
      disc1.Nome = "Portugues";
      disc1.Professor = "Josirley";
      disc1.Sigla = "PT";
      disc1.sala = 03;
      
      Disciplina disc2 = new Disciplina ();
      
      disc2.Nome = "Matemática";
      disc2.Professor = "Biazzi";
      disc2.Sigla = "MAT";
      disc2.sala = 8;
      
      Disciplina disc3 = new Disciplina ();
      
      disc3.Nome = "Física";
      disc3.Professor = "Salmazo";
      disc3.Sigla = "FIS";
      disc3.sala = 6;
      
      Livro l1 = new Livro ();
      l1.nomeLivro = "A Cabana";
      l1.autor = "William P. Young";
      l1.dataI = "05-03-2022";
      l1.dataD = "20-03-2022";
      l1.cod = 0024;
 
      
        System.out.println("Nome do aluno: "+aluno1.nome);
        System.out.println("RA de ("+aluno1.nome+") é "+aluno1.ra);
        System.out.println("ALUNO É MAIOR DE 18 ANOS = "+aluno1.deMaior);
        System.out.println("Disciplina favorita = "+disc2.Nome);
        System.out.println("Professor(a) favorito(a) = "+disc3.Professor);
        System.out.println("Livro EMPRESTADO COTIL = "+l1.nomeLivro+"\nData de Iniciação: "+l1.dataI+"  Data de Devolução: "+l1.dataD);
     
    }
    
}
