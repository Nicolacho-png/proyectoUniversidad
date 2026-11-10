# 🎓 Sistema de Información Universitario

**Sistema de Información Universitario** es una aplicación en consola desarrollada en **Java**, diseñada bajo los principios fundamentales de la **Programación Orientada a Objetos (POO)**. Su objetivo principal es simular la gestión y autenticación de distintos perfiles dentro de una institución académica (estudiantes, docentes y administrativos), aplicando herencia, polimorfismo y encapsulamiento.

---

## 🚀 Características Principales

* **Jerarquía de Clases y Herencia:** Implementación de una clase base general (`Persona`) de la cual heredan de forma especializada las subclases `Estudiante`, `Docente` y `Administrativo`.
* **Polimorfismo:** Sobrescritura del método `mostrarPanel()` en cada subclase para desplegar vistas y comportamientos personalizados según el rol del usuario autenticado.
* **Encapsulamiento Robusto:** Atributos protegidos y privados con acceso controlado mediante constructores parametrizados y métodos de validación de credenciales.
* **Validación Segura:** Lógica de inicio de sesión (`iniciarSesion`) que procesa cadenas de texto normalizadas (`trim()` y `toLowerCase()`) para garantizar una autenticación robusta por correo y contraseña.

---

## 📂 Estructura del Modelo (Clases)

1. **`Persona`**: Clase base que encapsula los atributos comunes de cualquier usuario del sistema (`nombre`, `documento`, `correo`, `clave`) e incluye la lógica central de autenticación y visualización de perfil.
2. **`Estudiante`**: Subclase que añade atributos específicos de la vida académica (`codigoEstudiante`, `programa`) y gestiona la consulta de calificaciones.
3. **`Docente`**: Subclase que incorpora los campos asociados al cuerpo docente (`codigoDocente`, `facultad`) y expone la función de registro de notas.
4. **`Administrativo`**: Subclase que maneja los datos correspondientes al personal de apoyo (`codigoEmpleado`, `dependencia`) y la generación de reportes institucionales.
5. **`Universidad`**: Clase principal (`main`) que inicializa los arreglos de usuarios, gestiona la entrada por consola del usuario mediante `Scanner` y ejecuta la validación polimórfica del sistema.

---

## 💻 Ejemplo de Salida en Consola

Al ejecutar la aplicación e ingresar las credenciales correctas de un usuario, el sistema procesa el acceso y despliega la siguiente interfaz:

==============================
    SISTEMA DE INFORMACION
        UNIVERSITARIO
==============================

Correo: 
laura@universidad.edu
Clave: 
Laura123

Inicio de sesion correcto.

===== PERFIL =====
Nombre: Laura Sofia Martinez
Documento: 100100100
Correo: laura@universidad.edu

===== PANEL DEL ESTUDIANTE =====
Bienvenido: Laura Sofia Martinez
Codigo: EST001
Programa: Ingenieria de sistemas
Consultando calificaciones del estudiante...
