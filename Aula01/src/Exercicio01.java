
import javax.swing.JOptionPane;

public class Exercicio01 {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema\n" + nome);
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema\n" + JOptionPane.showInputDialog("Digite o seu nome: "));
    }
}
