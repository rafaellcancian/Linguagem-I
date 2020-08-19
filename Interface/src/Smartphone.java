
public class Smartphone implements PDA, Celular {
    
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.verificarEmail();
        s.realizarChamada();
    }

    @Override
    public void verificarEmail() {
        System.out.println("Verificando...");
    }

    @Override
    public void realizarChamada() {
        System.out.println("Discando...");
    }
}
