
public class Imovel {

    public String proprietario;
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String UF;

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUF() {
        return UF;
    }

    public void setEndereco(String cep) {
        String xml = ClienteViaCepWS.buscarCep(cep);

        this.cep = xml.substring(xml.indexOf("<cep>") + 5, xml.lastIndexOf("</cep>"));
        this.logradouro = xml.substring(xml.indexOf("<logradouro>") + 12, xml.lastIndexOf("</logradouro>"));
        this.bairro = xml.substring(xml.indexOf("<bairro>") + 8, xml.lastIndexOf("</bairro>"));
        this.localidade = xml.substring(xml.indexOf("<localidade>") + 12, xml.lastIndexOf("</localidade>"));
        this.UF = xml.substring(xml.indexOf("<uf>") + 4, xml.lastIndexOf("</uf>"));
    }

}
