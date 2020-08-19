
public class Gerentes extends Funcionario {

    @Override
    public void atribuirAumento(float valor) {
        System.out.println("aumento de " + valor + " aplicado com sucesso");
    }

    @Override
    public void descontarPonto(float horas) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
