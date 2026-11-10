package universidad;

public class Persona {
    
    //================
    // ATRIBUTOS
    //================
    
    public String nombre;
    protected String correo;
    private String documento;
    private String clave;
    
    //================
    // CONSTRUCTOR
    //================
    
    public Persona(String nombre, String documento, String correo, String clave){
        
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.clave = clave;   
    }
    
    //================
    // METODOS
    //================
    
    public boolean iniciarSesion(String correoIngresado, String claveIngresada){
        
        if(correoIngresado == null || claveIngresada == null){
            
            return false;
            
        }
        
        correoIngresado = correoIngresado.trim().toLowerCase();
        return correo.equals(correoIngresado) &&  clave.equals(claveIngresada);
    
    }
    
    public void mostrarPerfil(){
        
        System.out.println();
        System.out.println("===== PERFIL =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Correo: " + correo);
        
    }
    
    public void mostrarPanel(){
        System.out.println();
        System.out.println("===== PANEL PRINCIPAL =====");
        System.out.println("Bienvenido al sistema universitario.");
        System.out.println("Usuario: " + nombre);
    }
}