
package constitem;

public class ConstItem {

    public static void main(String[] args) {
        
        Item trembolona = new Item (1,"O Trembolona É um esteroide anabolizante obtido através de uma alteração na molécula original da testosterona",2,200f);
        System.out.println("Código: "+trembolona.getCod());
        System.out.println("Descrição: "+trembolona.getDesc());
        System.out.println("Quantidade Comprada: "+trembolona.getQntItemC() );
        System.out.println("Valor Unidade: R$"+trembolona.getPrecoItem());
        System.out.println("Total: R$"+trembolona.getTotal());
        
        System.out.println("\n");
        
        Item durateston = new Item (2,"O Durateston é utilizado para a reposição de testosterona em homens para o tratamento de vários problemas de saúde, deixando monstrão",5,195f);
        System.out.println("Código: "+durateston.getCod());
        System.out.println("Descrição: "+durateston.getDesc());
        System.out.println("Quantidade Comprada: "+durateston.getQntItemC() );
        System.out.println("Valor Unidade: R$"+durateston.getPrecoItem());
        System.out.println("Total: R$"+durateston.getTotal());
        
        System.out.println("\n");
        
    }
    
}