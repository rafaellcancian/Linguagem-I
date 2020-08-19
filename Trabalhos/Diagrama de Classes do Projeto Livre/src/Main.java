
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        String[] escolhas = {"Condutor/Veículo", "Sair"};
        String[] escolhas2 = {"Categoria A", "Categoria B"};
        
        Condutor condutor = new Condutor();
        Moto moto = new Moto();
        Carro carro = new Carro();
        
        while (true) {
            int n = JOptionPane.showOptionDialog(null, "Escolha uma opção de cadastro abaixo:", "Cadastro de Condutores/Veículos", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolhas, null);
            
            switch (n) {
                case 0: {
                    while (true) {
                        try {
                            condutor.setNome(JOptionPane.showInputDialog(null, "Insira o nome do condutor:", "Cadastro de Condutores/Veículos", JOptionPane.PLAIN_MESSAGE));
                            break;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "ERRO: O nome inserido é inválido.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    
                    int n2 = JOptionPane.showOptionDialog(null, "Escolha uma opção de categoria abaixo:", "Cadastro de Condutores/Veículos", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolhas2, null);

                    if (n2 == 0) {
                        condutor.setCategoriaCarteira("A");
                        cadastrar(condutor, moto);
                    } else {
                        condutor.setCategoriaCarteira("B");
                        cadastrar(condutor, carro);
                    }
                    
                    break;
                }
                case 1: System.exit(0); break;
            }
        } 
    }
    
    public static void cadastrar(Condutor condutor, Moto moto) {
        Arquivo arquivo = new Arquivo();
        
        while (true) {
            try {
                moto.setPlaca(JOptionPane.showInputDialog(null, "Insira a placa da moto:", "Cadastro de Condutores/Veículos", JOptionPane.PLAIN_MESSAGE));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO: A placa inserida é inválida.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        while (true) {
            try {
                moto.setModelo(JOptionPane.showInputDialog(null, "Insira o modelo da moto:", "Cadastro de Condutores/Veículos", JOptionPane.PLAIN_MESSAGE));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO: O modelo inserido é inválido.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        arquivo.gravar(condutor, moto);
    }
    
    public static void cadastrar(Condutor condutor, Carro carro) {
        Arquivo arquivo = new Arquivo();
        
        while (true) {
            try {
                carro.setPlaca(JOptionPane.showInputDialog(null, "Insira a placa da carro:", "Cadastro de Condutores/Veículos", JOptionPane.PLAIN_MESSAGE));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO: A placa inserida é inválida.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        while (true) {
            try {
                carro.setModelo(JOptionPane.showInputDialog(null, "Insira o modelo da carro:", "Cadastro de Condutores/Veículos", JOptionPane.PLAIN_MESSAGE));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO: O modelo inserido é inválido.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        arquivo.gravar(condutor, carro);       
    }
    
}
