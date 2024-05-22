public class  Entrenador implements padre {

    private int id; 
    
    private String Apeliidos;
    private int Edad;
    private String IdFederacion;

    

    
    
    
    public Entrenador() {
        
    }

    // public Entrenador(padre Nombre, String apellidos) {
        
    //     this.Nombre = nombre;
    //     this.Apeliidos = apellidos;

    // }

    

    @Override
    public String Concentrarse(){

        return "estoy concentrado Entrenador";
    }

}
