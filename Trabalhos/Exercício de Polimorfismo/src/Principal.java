
import javax.swing.JOptionPane;

public class Principal {
    
    private static Uva uva;
    private static Arquivo arquivo;

    public static void main(String[] args) {
        uva = new Uva();
        arquivo = new Arquivo();
        
        uva.setNome(JOptionPane.showInputDialog("Digite o nome da uva:"));
        uva.setQuantidade(Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de uva:")));
        
        arquivo.cadastrar(uva);
    }
    
}
