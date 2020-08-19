
import javax.swing.JOptionPane;

public class Vetor {

    public static void main(String[] args) {
        int v[] = getvalor();

        JOptionPane.showMessageDialog(null, "Vetor 1: " + v[0] + "\nVetor 2: " + v[1]);
    }

    public static int[] getvalor() {
        int vetor[] = new int[2];

        vetor[0] = 10;
        vetor[1] = 20;

        return vetor;
    }
}
