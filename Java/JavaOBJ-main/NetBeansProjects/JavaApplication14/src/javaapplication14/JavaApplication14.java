package javaapplication14;
public class JavaApplication14 {

    public static void main(String[] args) {
     
         Cliente cli1 = new Cliente ();
         cli1.nome = "Antonio";
         cli1.idade = 20;
         cli1.altura = 1.65f;
         cli1.peso = 65f;
         cli1.deMaior = true;
         System.out.println("O cliente é maior de "+ "idade: "+cli1.deMaior );
         
         Cliente cli2 = new Cliente ();
         cli2.nome = "Joao";
         cli2.idade = 12;
         cli2.altura = 1.58f;
         cli2.peso = 44f;
         cli2.deMaior = false;
         System.out.println("O cliente é maior de idade: "+cli2.deMaior );
         cli2.verificaMaior();
         
         
         
         Veiculo veic1 = new Veiculo ();
         veic1.modelo = "Uno";
         veic1.marca = "Fiat";
         veic1.placa = 1234;
         veic1.ano = 2010;
         veic1.cor = "Preto";
         veic1.motor = 3.0f;
         veic1.escada = true;
         veic1.andar();
         veic1.sairDaFrente();
        
         
                 
         
         
    }
    
}
