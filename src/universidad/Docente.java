package universidad;

public class Docente extends Persona {
    
    private String codigoDocente;
    private String facultad;

    public Docente(
            String nombre,
            String documento,
            String correo,
            String clave,
            String codigoDocente,
            String facultad         
    ) {
        
        super(nombre, documento, correo, clave);
        
        this.codigoDocente = codigoDocente;
        this.facultad = facultad;
    }
    
    public void registrarNota() {
        
        System.out.println(
                "Registrando calificaciones de un estudiante..."
        );
    }
    
    @Override
    public void mostrarPanel() {
        
        System.out.println("===== PANEL DEL DOCENTE =====");
        System.out.println("Bienvenido: " + nombre);
        System.out.println("Codigo: " + codigoDocente);
        System.out.println("Facultad: " + facultad);
        
        registrarNota();
    }
}
