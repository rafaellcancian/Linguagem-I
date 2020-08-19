
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String nomearquivo = "cidades_e_estados.sql";

        int totalLinhas = contarLinhas(nomearquivo);
        String matriz[][] = criarMatriz(totalLinhas, nomearquivo);
        System.out.println(consultarMatriz(totalLinhas, matriz));
    }

    public static int contarLinhas(String arquivo) {
        int contador = 0;

        File file = new File(arquivo);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if ((linha.contains("INSERT")) && (linha.contains("tb_cidades"))) {
                    contador++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }

        return contador;
    }

    public static String[][] criarMatriz(int contador, String arquivo) {
        int i = 0;

        String matriz[][] = new String[contador][2];

        File file = new File(arquivo);
        try {
            Scanner scanner = new Scanner(file);
            while (i < contador) {
                String linha = scanner.nextLine();
                if ((linha.contains("INSERT")) && (linha.contains("tb_cidades"))) {
                    matriz[i][0] = linha.substring(44, 46);
                    matriz[i][1] = linha.substring(50, linha.lastIndexOf("'"));
                    i++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }

        return matriz;
    }

    public static String consultarMatriz(int contador, String matriz[][]) {
        String[] escolhas = {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
        String estado = "";
        estado = (String) JOptionPane.showInputDialog(null, "Escolha um estado abaixo:", "Consulta de Cidades baseado no Estado", JOptionPane.PLAIN_MESSAGE, null, escolhas, escolhas[0]);
        String estadosCidades = "";

        if (estado.equals("")) {
            System.out.println("ERRO: Nenhum valor foi inserido.");
        }

        for (int i = 0; i < contador; i++) {
            if (matriz[i][0].equals(estado)) {
                estadosCidades = estadosCidades + matriz[i][0] + " - " + matriz[i][1] + "\n";
            }
        }

        return estadosCidades;
    }
}
