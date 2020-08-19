
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Arquivo {
    public void cadastrar (Uva uva) {
        try {
            try (PrintWriter arquivo = new PrintWriter("Uva.txt", "UTF-8")) {
                arquivo.println("Nome: " + uva.getNome());
                arquivo.println("Quantidade: " + uva.getQuantidade());
                arquivo.close();
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cadastrar (Maca maca) {
        
    }
    
    public void cadastrar(String dados) {
        
    }
}
