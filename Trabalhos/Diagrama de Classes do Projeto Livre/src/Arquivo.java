
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Arquivo {

    public void gravar(Condutor condutor, Moto moto) {   
        try {
            File file = new File("data.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            try (PrintWriter arquivo = new PrintWriter (new FileWriter("data.txt", true))) {
                arquivo.println("Dados do condutor\nNome: " + condutor.getNome());
                arquivo.println("Categoria: " + condutor.getCategoriaCarteira());
                arquivo.println("\nDados do veículo\nTipo: Moto\nPlaca: " + moto.getPlaca());
                arquivo.println("Modelo: " + moto.getModelo());
                arquivo.println("--------------------------------------------------");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public void gravar(Condutor condutor, Carro carro) {
        try {
            File file = new File("data.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            try (PrintWriter arquivo = new PrintWriter (new FileWriter("data.txt", true))) {
                arquivo.println("Dados do condutor\nNome: " + condutor.getNome());
                arquivo.println("Categoria: " + condutor.getCategoriaCarteira());
                arquivo.println("\nDados do veículo\nTipo: Carro\nPlaca: " + carro.getPlaca());
                arquivo.println("Modelo: " + carro.getModelo());
                arquivo.println("--------------------------------------------------");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }           
    }
       
}
