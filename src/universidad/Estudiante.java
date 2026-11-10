package universidad;


public class Estudiante extends Persona {
    
    //Atributos de Estudiantes
    private String codigoEstudiante;
    private String programa;

    public Estudiante(
            String nombre, 
            String documento,
            String correo,
            String clave,
            String codigoEstudiante,
            String programa
    ) {
        
        super(nombre, documento, correo, clave);
        
        this.programa = programa;
        this.codigoEstudiante = codigoEstudiante;
        
    }
    
    //Mtodos clase estudiantes
    public void consultarNotas(){
    
        System.out.println(
                "Consultando calificaciones del estudiante..."
        );
    }
    
    @Override
    public void mostrarPanel(){
        
        System.out.println();
        System.out.println("===== PANEL DEL ESTUDIANTE =====");
        System.out.println("Bienvenido: " + nombre);
        System.out.println("Codigo: " + codigoEstudiante);
        System.out.println("Programa: " + programa);
        
        consultarNotas();
        
    }
}
