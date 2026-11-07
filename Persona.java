package sistema;

/**
 * Clase padre que representa los datos generales de cualquier persona
 * registrada en el sistema.
 */
public class Persona {
    // protected: las clases hijas pueden acceder directamente a este atributo.
    protected String nombre;

    // private: solo se puede modificar mediante los métodos getter y setter.
    private int edad;

    // public: atributo accesible desde cualquier clase.
    public String identificador;

    // Ejemplos de tipos primitivos y sus clases envolventes (no primitivos).
    protected int edad_primitiva = 20;
    protected Integer edad_objeto = 20;

    protected double promedio_primitivo = 9.0;
    protected Double promedio_objeto = 9.0;

    protected boolean activo_primitivo = true;
    protected Boolean activo_objeto = Boolean.TRUE;

    protected char categoria_primitiva = 'A';
    protected Character categoria_objeto = 'A';

    protected long registro_primitivo = 1000L;
    protected Long registro_objeto = 1000L;

    protected float estatura_primitiva = 1.70f;
    protected Float estatura_objeto = 1.70f;

    protected short nivel_primitivo = 2;
    protected Short nivel_objeto = 2;

    protected byte turno_primitivo = 1;
    protected Byte turno_objeto = 1;

    // Constructor de la clase padre.
    public Persona(String nombre, int edad, String identificador) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificador = identificador;
    }

    // Método general que las clases hijas reinterpretan (sobrescriben).
    public void mostrarInformacion() {
        System.out.println("Persona: " + nombre + " | Edad: " + edad
                + " | ID: " + identificador);
    }

    // Getter: permite consultar el atributo privado edad.
    public int getEdad() {
        return edad;
    }

    // Setter: permite modificar el atributo privado edad con validación.
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Getter y setter del atributo protegido nombre.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }
}

