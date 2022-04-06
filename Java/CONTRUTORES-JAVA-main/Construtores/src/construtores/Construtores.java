package construtores;
public class Construtores {
    public static void main(String[] args) {

        System.out.println("********************************");
        Aluno a2 = new Aluno(201110,"Matheus Sinatora");
        System.out.println("NOME: "+a2.getNome());
        System.out.println("RA: "+a2.getRa());
        double media = a2.calculaMedia(10, 8.5);
        System.out.println("Média: "+media);
        media =  a2.calculaMedia(5.5, 2.7, 3.5);
        System.out.println("Média 2:  "+media);
        
        //
        System.out.println("********************************\n");
        System.out.println("********************************");
        //
        
        Professor p2 = new Professor(34,"Jose","Matematica");
        System.out.println("Nome PROFª.: "+p2.getNome());
        System.out.println("Idade PROFª.: "+p2.getIdade());
        System.out.println("Disciplina: "+p2.getDisciplina());
        
        //
        System.out.println("********************************");
        //
        
        Professor p3 = new Professor(62,"Rogério Guimarães","Quimica");   
        System.out.println("Nome PROFª.: "+p3.getNome());
        System.out.println("Idade PROFª.: "+p3.getIdade());
        System.out.println("Disciplina: "+p3.getDisciplina());
        
        
 
    }
    
}
