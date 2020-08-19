
public class Main {

    public static void main(String[] args) {
        Thread tarefa1 = new Tarefa1();
        Thread tarefa2 = new Thread(new Tarefa2());
        
        tarefa1.start();
        tarefa2.start();
    }
    
}
