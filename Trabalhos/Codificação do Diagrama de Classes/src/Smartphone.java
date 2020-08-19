
public class Smartphone extends Eletronico {
    private String resolucao;
    private int numChips;
    
    public Smartphone() {
        
    }
    
    public Smartphone(String marca, String modelo, String resolucao, int numChips) {
        
    }
    
    public String getResolucao() {
        return resolucao;
    }
    
    public void setResolucao(String resolucao) {
        this.resolucao = "String";
    }
    
    public int getnumChips() {
        return numChips;
    }
    
    public void setnumChips(int numChips) {
        this.numChips = 1;
    }
    
}