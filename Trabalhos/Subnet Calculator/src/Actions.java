
import java.awt.Color;
import javax.swing.JOptionPane;


public class Actions implements ActionsInterface {
    
    private final GUI gui;
    
    public Actions(GUI gui) {
        this.gui = gui;
    }
    
    @Override
    public void verificar() {
        boolean erro1,erro2,erro3,erro4;
       
        try {
            if ((gui.octeto1.getText().isEmpty()) || (gui.octeto1.getText().length() > 3) || (Integer.parseInt(gui.octeto1.getText()) < 0) || (Integer.parseInt(gui.octeto1.getText()) > 255)) {
                erro1 = true;
                gui.octeto1.setBackground(Color.red);
            } else {
                erro1 = false;
                gui.octeto1.setBackground(Color.white);
            }     
            if ((gui.octeto2.getText().isEmpty()) || (gui.octeto2.getText().length() > 3) || (Integer.parseInt(gui.octeto2.getText()) < 0) || (Integer.parseInt(gui.octeto2.getText()) > 255)) {
                erro2 = true;
                gui.octeto2.setBackground(Color.red);
            } else {
                erro2 = false;
                gui.octeto2.setBackground(Color.white);
            }      
            if ((gui.octeto3.getText().isEmpty()) || (gui.octeto3.getText().length() > 3) || (Integer.parseInt(gui.octeto3.getText()) < 0) || (Integer.parseInt(gui.octeto3.getText()) > 255)) {
                erro3 = true;
                gui.octeto3.setBackground(Color.red);
            } else {
                erro3 = false;
                gui.octeto3.setBackground(Color.white);
            }
            if ((gui.octeto4.getText().isEmpty()) || (gui.octeto4.getText().length() > 3) || (Integer.parseInt(gui.octeto4.getText()) < 0) || (Integer.parseInt(gui.octeto4.getText()) > 255)) {
                erro4 = true;
                gui.octeto4.setBackground(Color.red);
            } else {
                erro4 = false;
                gui.octeto4.setBackground(Color.white);
            }
            
            if ((erro1 == false) && (erro2 == false) && (erro3 == false) && (erro4 == false)) {
                gui.console.setText("Endereço IP: " + gui.octeto1.getText() + "." + gui.octeto2.getText() + "." + gui.octeto3.getText() + "." + gui.octeto4.getText());
                gui.subnetMask.setEnabled(true);
                gui.calculateButton.setEnabled(true);
            } else {
                gui.subnetMask.setEnabled(false);
                gui.calculateButton.setEnabled(false);
                gui.saveButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Os valores inseridos são inválidos.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    @Override
    public void calcular(int valorSoma, int valorTotal) {
        String rede;
        String broadcast;
        int r = 0;
        int b = valorSoma;
        int i,j;
        
        for (i = 0; i < valorTotal; i++) {
            for (j = r; j <= b; j++) {
                if (j == Integer.parseInt(gui.octeto4.getText())) {
                    rede = Integer.toString(r);
                    broadcast = Integer.toString(b);
                    gui.setRede(rede);
                    gui.setBroadcast(broadcast);
                    exibir(rede, broadcast);
                }
            }                    
            r = r + valorSoma + 1;
            b = b + valorSoma + 1;
        }
    }
    
    @Override
    public void exibir(String rede, String broadcast) {
        gui.console.setText("Endereço IP: " + gui.octeto1.getText() + "." + gui.octeto2.getText() + "." + gui.octeto3.getText() + "." + gui.octeto4.getText()
            + "\nMáscara de Sub-rede: " + gui.subnetMask.getItemAt(gui.subnetMask.getSelectedIndex())
            + "\n\nRede: " + gui.octeto1.getText() + "." + gui.octeto2.getText() + "." + gui.octeto3.getText() + "." + rede
            + "\nBroadcast: " + gui.octeto1.getText() + "." + gui.octeto2.getText() + "." + gui.octeto3.getText() + "." + broadcast
        );        
    }
    
    @Override
    public void exibirMascara() {
        gui.console.setText("Endereço IP: " + gui.octeto1.getText() + "." + gui.octeto2.getText() + "." + gui.octeto3.getText() + "." + gui.octeto4.getText()
            + "\nMáscara de Sub-rede: " + gui.subnetMask.getItemAt(gui.subnetMask.getSelectedIndex())
        );
    }
    
    @Override
    public void desativarBotoes() {
        gui.subnetMask.setEnabled(false);
        gui.calculateButton.setEnabled(false);
        gui.saveButton.setEnabled(false);
    }
  
    @Override
    public void reiniciar() {
        gui.octeto1.setText("");
        gui.octeto2.setText("");
        gui.octeto3.setText("");
        gui.octeto4.setText("");
        gui.octeto1.setBackground(Color.white);
        gui.octeto2.setBackground(Color.white);
        gui.octeto3.setBackground(Color.white);
        gui.octeto4.setBackground(Color.white);
        gui.subnetMask.setSelectedIndex(0);
        gui.console.setText("");
        gui.subnetMask.setEnabled(false);
        gui.calculateButton.setEnabled(false);
        gui.saveButton.setEnabled(false);
    }
    
}
