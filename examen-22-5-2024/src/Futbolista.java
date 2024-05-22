public class Futbolista implements padre {
    
    private int id; 
    private String Nombre;
    private String Apeliidos;
    private int Edad;
    private int Dorsal;
    private String Demarcacion; 

    public Futbolista() {
        
    }

    public Futbolista(String nombre, String apellido) {
        this.Nombre = nombre;
        this.Apeliidos = apellido;
    }
    
    @Override
    public String Concentrarse(){

        return "estoy concentrado futbolista";
    }



}
