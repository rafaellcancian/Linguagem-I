/*/
-> Solicitar ao usuário, um número inteiro e positivo;
-> Realizar o fatorial de tal número;
-> Armazenar em um vetor, os cinco próximos pares após o resultado obtido com o cálculo;
-> Exibir, na tela, o número lido, o número resultante do cálculo do fatorial e o conteúdo do vetor.
/*/

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int num,i,fat,tempfat=1,count=4;
        int vet[] = new int[5];
        String exibirvet = "";
        
        String numS = JOptionPane.showInputDialog("Digite um número: ");
        num = Integer.parseInt(numS);
        
        for (i = 1; i <= num; i++) {
            tempfat = tempfat * i;
        }
        
        fat = tempfat;
        
        for (i = 0; i < 10; i++) {
            tempfat++;
            
            if (tempfat % 2 == 0) {
                vet[count] = tempfat;
                count--;
            }
        }
        
        for (i = 0; i < 5; i++) {
            exibirvet = vet[i] + " " + exibirvet;
        }
        
        JOptionPane.showMessageDialog(null, "O fatorial de \'" + num + "\' é: " + fat + "\nOs próximos 5 pares do resultado do fatorial são:\n" + exibirvet);
    }
}
