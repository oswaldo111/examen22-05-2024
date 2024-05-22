public class Masajista implements padre {

    private int id; 
    private String Nombre;
    private String Apeliidos;
    private int Edad;
    private String Titulacion;
    private int AñosExperiencia;

    public Masajista() {
        
    }

    public Masajista(String nombre, String apellido ) {
        
        this.Nombre = nombre;
        this.Apeliidos = nombre;
    }

    @Override
    public String Concentrarse(){

        return "estoy concentrado masajista";
    }
    
    
}