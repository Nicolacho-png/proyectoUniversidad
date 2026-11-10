package universidad;

import java.util.Scanner;

public class Universidad {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        Estudiante estudiante = 
                new Estudiante(
                        "Laura Sofia Martinez",
                        "100100100",
                        "laura@universidad.edu",
                        "Laura123",
                        "EST001",
                        "Ingenieria de sistemas"
                );
        
        Docente docente = 
                new Docente(
                        "Carlos Perez",
                        "200200200",
                        "carlos@universida.edu",
                        "Carlos123",
                        "DOC001",
                        "Facultad de ingenieria"
                );
        
        Administrativo administrativo = 
                new Administrativo(
                        "Ana Torres",
                        "300300300",
                        "ana@universida.edu",
                        "Ana12345",
                        "ADM001",
                        "Registro Academico"
                );
        
        Persona [] usuarios = {
            estudiante,
            docente,
            administrativo
        };
        
        System.out.println("==============================");
        System.out.println("    SISTEMA DE INFORMACION");
        System.out.println("        UNIVERSITARIO");
        System.out.println("============================");
        
        System.out.println("\nCorreo: " );
        String correoIngresado =
                entrada.nextLine();
        
        System.out.println("Clave: ");
        String claveIngresada =
                entrada.nextLine();
        
        boolean encontrado  = false;
        
        for(Persona usuario : usuarios){
            
            if(usuario.iniciarSesion(
                    correoIngresado, 
                    claveIngresada)){
                
                encontrado = true;
                
                System.out.println();
                System.out.println(
                        "Inicio de sesion correcto."
                );
                
                usuario.mostrarPerfil();
                
                usuario.mostrarPanel();
                
                break;
            }
            
        }
        
        if(!encontrado){
            
            System.out.println();
            System.out.println(
                    "Correo o clave incorrectos."
            );
        }
        
        entrada.close();
    }
    
}
