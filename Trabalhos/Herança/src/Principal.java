
import javax.swing.JOptionPane;

public class Principal {
    
    public static Vinho vinho;

    public static void main(String[] args) {
        vinho = new Vinho();
        cadastrarProduto();
        
        System.out.println("Produto cadastrado com sucesso!\n" + 
            "\nNome: " + vinho.nome + 
            "\nDescrição: " + vinho.descricao + 
            "\nValor: " + vinho.valor + 
            "\nCódigo: " + vinho.codigo +
            "\nVolume: " + vinho.volume +
            "\nÍndice de ABV: " + vinho.ABV +
            "\nTipo de uva: " + vinho.tipoUva
        );
    }
    
    public static void cadastrarProduto() {
        vinho.nome=JOptionPane.showInputDialog("Digite o nome do vinho:");
        vinho.descricao=JOptionPane.showInputDialog("Digite a descrição do vinho:");
        vinho.valor=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do vinho:"));
        vinho.codigo=JOptionPane.showInputDialog("Digite o código do vinho:");
        vinho.volume=Integer.parseInt(JOptionPane.showInputDialog("Digite o volume do vinho:"));
        vinho.ABV=Float.parseFloat(JOptionPane.showInputDialog("Digite o índice de ABV do vinho:"));
        vinho.tipoUva=JOptionPane.showInputDialog("Digite o tipo da uva do vinho:");
    }

}
