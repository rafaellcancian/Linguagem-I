/*/
a) Criar uma aplicação para:
    -> Ler dois valores reais;
    -> Exibir os próximos inteiros deles (arredondamento superior);
    -> Exibir os inteiros anteriores deles (arredondamento inferior);
    -> Exibir o maior e o menor valor lido.
b) Gerar 3 números inteiros de forma aleatória (1 à 100);
/*/

import java.util.Random;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        float v[] = getValues();
        calcular(v);

        Random r = new Random();
        gerarExibir(r.nextInt(100), r.nextInt(100), r.nextInt(100));
    }

    public static float[] getValues() {
        float vetor[] = new float[2];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor real"));
        }

        return vetor;
    }

    public static void calcular(float vetor[]) {
        JOptionPane.showMessageDialog(null,
            "Arredondamento superior de " + vetor[0] + " e " + vetor[1] + " é respectivamente: " + Math.ceil(vetor[0]) + " e " + Math.ceil(vetor[1])
            + "\n" + "Arredondamento inferior de " + vetor[0] + " e " + vetor[1] + " é respectivamente: " + Math.floor(vetor[0]) + " e " + Math.floor(vetor[1])
            + "\n" + "Maior valor entre " + vetor[0] + " e " + vetor[1] + " é: " + Math.max(vetor[0], vetor[1])
            + "\n" + "Menor valor entre " + vetor[0] + " e " + vetor[1] + " é: " + Math.min(vetor[0], vetor[1])
        );
    }

    public static void gerarExibir(int v1, int v2, int v3) {
        JOptionPane.showMessageDialog(null, "Foram gerados os valores: " + v1 + ", " + v2 + " e " + v3);
    }
}
