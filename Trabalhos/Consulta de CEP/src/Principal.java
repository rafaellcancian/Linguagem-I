
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Imovel imovel = new Imovel();

        imovel.proprietario = JOptionPane.showInputDialog(null, "Digite o nome do proprietário:", "Consulta de CEP", JOptionPane.PLAIN_MESSAGE);
        
        try {
            imovel.setEndereco(JOptionPane.showInputDialog(null, "Digite o CEP:", "Consulta de CEP", JOptionPane.PLAIN_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: O CEP inserido é inválido.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            reiniciar();
        }

        JOptionPane.showMessageDialog(null,
            "Proprietário: " + imovel.proprietario
            + "\n\nCEP: " + imovel.getCep()
            + "\nLogradouro/Nome: " + imovel.getLogradouro()
            + "\nBairro/Distrito: " + imovel.getBairro()
            + "\nLocalidade/UF: " + imovel.getLocalidade() + "/" + imovel.getUF(),
            "Consulta de CEP", JOptionPane.PLAIN_MESSAGE
        );
        
        reiniciar();
    }
    
    public static void reiniciar() {
        String[] args = new String[1];
        String[] escolhas = {"Sim", "Não"};
        int n = JOptionPane.showOptionDialog(null, "Você quer reiniciar o programa?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolhas, null);

        if (n == 0) {
            main(args);
        }

        System.exit(0);
    }
    
}
