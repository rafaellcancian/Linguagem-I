
public class Principal {

    public static void main(String[] args) {
        String s = "Java";
        int i;
        char c;
        i = s.length(); // retorna um inteiro com o tamanho da String s
        c = s.charAt(2); // retorna o 3º caractere contido na String s
        s = s.toUpperCase(); // armazena em s a própria String em caixa ALTA
        s = s.toLowerCase(); // armazena em s a própria String em caixa BAIXA
        s = s.substring(2); // armazena em s a própria String a partir do caractere 2
        s = s.substring(1, 3); // armazena em s a própria String entre um caractere inicial e final
        s = s.trim(); // armazena em s a própria String removendo espaçoes em branco
        s = s.replace('a', 'x'); // armazena em s a própria String no inicio e no final da String
        s = s.concat("1P1"); // concatena a String s com "LP1"
        i = s.indexOf('v'); // armazena em i a posição da primeira ocorrência de 'v' na String

    }

}
