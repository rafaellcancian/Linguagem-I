
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Imovel imovel = new Imovel();

        imovel.proprietario = JOptionPane.showInputDialog("Digite o nome do proprietário:");
        imovel.setCep(JOptionPane.showInputDialog("Digite o CEP:"));

        System.out.println("Nome do proprietário: " + imovel.proprietario + "\nCEP: " + imovel.getCep());
    }

}
