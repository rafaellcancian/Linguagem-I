
public class Principal {

    public static void main(String[] args) {
        Atuador atuador = new Atuador();
        atuador.status = true;
        System.out.println("Status A1=" + atuador.status);
        atuador.setPoint("OFF");
        System.out.println("Value A1:" + atuador.getValue());
        
        Atuador atuador2 = new Atuador("ON");
        System.out.println("Status A2=" + atuador2.status);
        System.out.println("Value A2:" + atuador2.getValue());
    }
    
}
