/*/
1) Desenvolver uma aplicação para ranking/classificação de atletas (nomes e notas);
-> Solicitar nomes e notas;
-> Classificar os atletas (Da maior nota para a menor);
-> Exibir a classicação (Nota e nome dos atletas).
/*/

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String exibir;
        int quantidadeAtleta = 0, cadastrarNovo;

        String nomeAtleta[] = new String[100];
        float notaAtleta[] = new float[100];

        do {
            nomeAtleta[quantidadeAtleta] = JOptionPane.showInputDialog("Digite o nome do " + (quantidadeAtleta + 1) + "º atleta: ");
            notaAtleta[quantidadeAtleta] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do " + (quantidadeAtleta + 1) + "º atleta: "));
            cadastrarNovo = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar mais um atleta?\n[1] = SIM\n[0] = NÃO"));

            if ((cadastrarNovo == 1) || (cadastrarNovo == 0)) {
                quantidadeAtleta++;
            } 
            else {
                JOptionPane.showMessageDialog(null, "ERRO: O valor inserido é inválido. Por favor realize o cadastro novamente.");
            }
        } while (cadastrarNovo != 0);

        exibir = ordenarExibir(nomeAtleta, notaAtleta, quantidadeAtleta);

        JOptionPane.showMessageDialog(null, "Os atletas foram classificados por ordem decrescente (Nome → Nota):\n" + exibir);
    }

    public static String ordenarExibir(String nomeAtleta[], float notaAtleta[], int quantidadeAtleta) {
        String tempS, exibir = "";
        float temp;
        int i, j;

        for (i = 0; i < quantidadeAtleta; i++) {
            for (j = i + 1; j < quantidadeAtleta; j++) {

                if (notaAtleta[i] > notaAtleta[j]) {
                    temp = notaAtleta[i];
                    notaAtleta[i] = notaAtleta[j];
                    notaAtleta[j] = temp;

                    tempS = nomeAtleta[i];
                    nomeAtleta[i] = nomeAtleta[j];
                    nomeAtleta[j] = tempS;
                }
            }
            exibir = nomeAtleta[i] + " → " + notaAtleta[i] + "\n" + exibir;
        }

        return exibir;
    }
}
