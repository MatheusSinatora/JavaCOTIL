
package constitem;

public class Item {
    
    private int cod;
    private String desc;
    private int qntItemC;
    private float precoItem;
    private float total;


    public Item(int cod, String desc, int qntItemC, float precoItem)
    {
        this.cod = cod;
        this.desc = desc;
        if(qntItemC < 0)
            this.qntItemC = 0;
        else
            this.qntItemC = qntItemC;
        if(precoItem < 0)
            this.precoItem = 0;
        else
            this.precoItem = precoItem;
        
    }
    
    public float getTotal() {
        total = (qntItemC * precoItem);
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQntItemC() {
        return qntItemC;
    }

    public void setQntItemC(int qntItemC) {
        if(qntItemC < 0)
            this.qntItemC = 0;
        else
            this.qntItemC = qntItemC;
        this.qntItemC = qntItemC;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        if(precoItem < 0)
            this.precoItem = 0;
        else
            this.precoItem = precoItem;
        this.precoItem = precoItem;
    }
    
    

}
