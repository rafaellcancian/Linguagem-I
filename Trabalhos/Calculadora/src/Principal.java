/*/
1) Implementar uma aplicação Java para:
Exibir um menu com as opções de:
-> Ler dois valores;
-> Permitir a escolha de qual operação aritmética será realizada (+, -, * ou /);
-> Exibir o resultado do cálculo escolhido;
-> Aplicação em loop até que uma opção de sair seja escolhida.
/*/

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        double valor1 = 0, valor2 = 0, resultado;
        int inicializar = 1;

        for (;;) {
            if (inicializar == 1) {
                int count = 1;
                valor1 = pegarValor(count);
                count++;
                valor2 = pegarValor(count);

                inicializar = 0;
            }

            String operacao = JOptionPane.showInputDialog("Escolha uma operação:\n[ + ] = SOMAR\n[ - ] = SUBTRAIR\n[ * ] = MULTIPLICAR\n[ / ] = DIVIDIR\n\n[ R ] = REINICIAR\n[ S ] = SAIR");

            switch (operacao) {
                case "+": {
                    resultado = somar(valor1, valor2);
                    exibirResultado(valor1, valor2, operacao, resultado);
                    break;
                }
                case "-": {
                    resultado = subtrair(valor1, valor2);
                    exibirResultado(valor1, valor2, operacao, resultado);
                    break;
                }
                case "*": {
                    resultado = multiplicar(valor1, valor2);
                    exibirResultado(valor1, valor2, operacao, resultado);
                    break;
                }
                case "/": {
                    resultado = dividir(valor1, valor2);
                    exibirResultado(valor1, valor2, operacao, resultado);
                    break;
                }
                case "r":
                case "R": {
                    inicializar = 1;
                    break;
                }
                case "s":
                case "S": {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "ERRO: O valor inserido é inválido.");
                    break;
                }
            }
        }
    }

    public static double pegarValor(int count) {
        double valor;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + count + "º valor:"));
        return valor;
    }

    public static double somar(double v1, double v2) {
        return (v1 + v2);
    }

    public static double subtrair(double v1, double v2) {
        return (v1 - v2);
    }

    public static double multiplicar(double v1, double v2) {
        return (v1 * v2);
    }

    public static double dividir(double v1, double v2) {
        return (v1 / v2);
    }

    public static void exibirResultado(double v1, double v2, String op, double result) {
        JOptionPane.showMessageDialog(null, "O resultado da operação (" + v1 + " " + op + " " + v2 + ") é: " + result);
    }
}
