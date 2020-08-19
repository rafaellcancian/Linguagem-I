/*/
1) Conceito: A palavra "abstract" serve para impedir que uma classe possa ser instanciada.
2) Onde se aplica: Se aplica no polimorfismo e herança dos atributos e métodos.
3) Como se aplica: Colocando a palavra "abstract" após o atributo de visibilidade da classe torna ela uma classe abstrata.
    Ex.: public abstract class Funcionario {
/*/

public class Principal {
    
    public static void main(String[] args) {
        Gerentes gerentes = new Gerentes();
        
        gerentes.setNome("joão");
        System.out.println("Nome:" +gerentes.getNome()); 
        gerentes.atribuirAumento(1000);
    }
    
}
