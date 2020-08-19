
public class Sensor {
    private String status;
    private String modelo;
    private String fabricante;
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void exibirFabricante() {
        System.out.println("Fabricante: " + fabricante);
    }
    
/*/
    public static void exibirFabricante() {
        System.out.println("Novus");
    }
/*/
    
}
