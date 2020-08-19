
import java.util.Random;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int i, count = 1;
        int numGerados[] = gerarNumeros();
        String exibir = "";

        for (i = 0; i < 60; i++) {
            exibir = exibir + count + "º Cartela:\n" + numGerados[i] + "  -  " + numGerados[i + 1] + "  -  " + numGerados[i + 2] + "  -  " + numGerados[i + 3] + "  -  " + numGerados[i + 4] + "  -  " + numGerados[i + 5] + "\n";

            i = i + 5;
            count++;
        }

        JOptionPane.showMessageDialog(null, "As cartelas foram geradas:\n" + exibir);
    }

    public static int[] gerarNumeros() {
        int i, j, repetido;
        int num[] = new int[60];

        Random random = new Random();

        for (i = 0; i < 60; i++) {
            do {
                repetido = 0;
                num[i] = random.nextInt(100);

                for (j = 0; j < i; j++) {
                    if (num[i] == num[j]) {
                        repetido = 1;
                    }
                }
            } while (repetido == 1);
        }

        return num;
    }
}
