
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String nomearquivo = "cidades_e_estados.sql";

        int totalLinhas = contarArquivo(nomearquivo);
        String matriz[][] = criarMatriz(totalLinhas, nomearquivo);
        System.out.println(consultarMatriz(totalLinhas, matriz));
    }

    public static int contarArquivo(String arquivo) {
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
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
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
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }

        return matriz;
    }

    public static String consultarMatriz(int contador, String matriz[][]) {
        String estado = JOptionPane.showInputDialog("Digite um estado: ");
        String estadosCidades = "";

        if ((estado.equals("AC"))
            || (estado.equals("AL"))
            || (estado.equals("AM"))
            || (estado.equals("AP"))
            || (estado.equals("BA"))
            || (estado.equals("CE"))
            || (estado.equals("DF"))
            || (estado.equals("ES"))
            || (estado.equals("GO"))
            || (estado.equals("MA"))
            || (estado.equals("MG"))
            || (estado.equals("MS"))
            || (estado.equals("MT"))
            || (estado.equals("PA"))
            || (estado.equals("PB"))
            || (estado.equals("PE"))
            || (estado.equals("PI"))
            || (estado.equals("PR"))
            || (estado.equals("RJ"))
            || (estado.equals("RN"))
            || (estado.equals("RO"))
            || (estado.equals("RR"))
            || (estado.equals("RS"))
            || (estado.equals("SC"))
            || (estado.equals("SE"))
            || (estado.equals("SP"))
            || (estado.equals("TO"))) {
            for (int i = 0; i < contador; i++) {
                if (matriz[i][0].equals(estado)) {
                    estadosCidades = estadosCidades + matriz[i][0] + " - " + matriz[i][1] + "\n";
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERRO: O estado inserido é inválido.");
            System.exit(0);
        }

        return estadosCidades;
    }
}
