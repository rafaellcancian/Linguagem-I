
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Arquivo {

    public void salvar(GUI gui) {   
        try {
            File file = new File("Resultados.txt");
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();

            if (!file.exists()) {
                file.createNewFile();
            }

            try (PrintWriter arquivo = new PrintWriter (new FileWriter("Resultados.txt", true))) {
                arquivo.println("Data/Hora: " + dateFormat.format(date) + "\n\nEndereço IP: " + gui.octeto1.getText() + "." + gui.octeto2.getText() + "." + gui.octeto3.getText() + "." + gui.octeto4.getText()
                    + "\nMáscara de Sub-rede: " + gui.subnetMask.getItemAt(gui.subnetMask.getSelectedIndex())
                    + "\n\nRede: " + gui.octeto1.getText() + "." + gui.octeto2.getText() + "." + gui.octeto3.getText() + "." + gui.getRede()
                    + "\nBroadcast: " + gui.octeto1.getText() + "." + gui.octeto2.getText() + "." + gui.octeto3.getText() + "." + gui.getBroadcast()
                );
                arquivo.println("--------------------------------------------------");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }        
    }
       
}
