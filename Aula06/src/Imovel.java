
public class Imovel {

    public String proprietario;
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        int tamanho = cep.length();

        if ((tamanho < 8) && (!cep.equals("00000000"))) {
            this.cep = cep;
        } else {
            System.out.println("ERRO: CEP inválido.");
            System.exit(0);
        }
    }

}
