
package funcionario;

public class Funcionario {
    public static void main(String[] args) {
        
        ClasseFunc func1 = new ClasseFunc ("Roberto","Silva",1000f);
        System.out.println("NOME: "+func1.getNome());
        System.out.println("SOBRENOME: "+func1.getSobrenome());
        System.out.println("SALÁRIO ANUAL: R$"+func1.getSalAnual());
        System.out.println("SALÁRIO ANUAL FINAL: R$"+func1.getSalFinal());
        
        System.out.println("\n");
        
        ClasseFunc func2 = new ClasseFunc ("Felipe","Gustavo",-1000f);
        System.out.println("NOME: "+func2.getNome());
        System.out.println("SOBRENOME: "+func2.getSobrenome());
        System.out.println("SALÁRIO: R$"+func2.getSalMen());
        System.out.println("SALÁRIO ANUAL: R$"+func2.getSalAnual());
        System.out.println("SALÁRIO ANUAL FINAL: R$"+func2.getSalFinal());
        
        System.out.println("\n");    
    }   
}