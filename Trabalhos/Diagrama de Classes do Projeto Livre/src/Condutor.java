
public class Condutor {

    private String nome;
    private String categoriaCarteira;
    
    public Condutor() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.matches(".*\\d.*") || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome inserido é inválido.");
        } else {
            this.nome = nome;
        }
    }

    public String getCategoriaCarteira() {
        return categoriaCarteira;
    }

    public void setCategoriaCarteira(String tipoCarteira) {
        this.categoriaCarteira = tipoCarteira;
    }

}
