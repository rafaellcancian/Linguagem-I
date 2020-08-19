
import javax.swing.JOptionPane;

public class Modelo {

    public static void main(String[] args) {

        String nome = getNome();
        double valor1 = getValor();
        double valor2 = getValor();
        double resultado = calcular(valor1, valor2);
        exibirResultado(nome, valor1, valor2, resultado);
    }

    public static String getNome() {
        return JOptionPane.showInputDialog("Digite seu nome:");
    }

    public static double getValor() {
        double valor;
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        return valor;
    }

    public static double calcular(double v1, double v2) {
        return (v1 + v2);
    }

    public static void exibirResultado(String nome, double v1, double v2, double resultado) {
        JOptionPane.showMessageDialog(null, "Prezado " + nome + " a soma entre " + v1 + " e " + v2 + " resulta em: " + resultado);
    }
}
