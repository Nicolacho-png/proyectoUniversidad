package universidad;

public class Administrativo extends Persona {
   
    private String codigoEmpleado;
    private String dependencia;

    public Administrativo(
            String nombre,
            String documento,
            String correo,
            String clave,
            String codigoEmpleado, 
            String dependencia
    ) {
        
        super(nombre, documento, correo, clave);
        this.codigoEmpleado = codigoEmpleado;
        this.dependencia = dependencia;
    }
    
    public void generarReporte(){
        
        System.out.println(
                "Generando reporte administrativo"
        );
    }
    
    @Override
    public void mostrarPanel(){
        
        System.out.println();
        System.out.println("===== PANEL DEL DOCENTE =====");
        System.out.println("Bienvenido: " + nombre);
        System.out.println("Codigo: " + codigoEmpleado);
        System.out.println("Dependencia: " + dependencia);
        
        generarReporte();   
    }
    
    
}
