
public abstract class VeiculoAutomotor {

    private String placa;
    private String modelo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.length() == 7 || placa.isEmpty()) {
            this.placa = placa;
        } else {
            throw new IllegalArgumentException("A placa inserida é inválida.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.matches(".*\\d.*") || modelo.isEmpty()) {
            throw new IllegalArgumentException("O modelo inserido é inválido.");
        } else {
            this.modelo = modelo;
        }
    }

}
