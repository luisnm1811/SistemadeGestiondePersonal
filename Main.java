package sistema;

/** Punto de entrada: demuestra herencia, polimorfismo y colecciones. */
public class Main {
    public static void Main(String[] args) {
        System.out.println("===== SISTEMA DE GESTIÓN DE PERSONAL =====");

        // Polimorfismo: referencias de tipo Persona apuntan a objetos hijos.
        Persona[] personas = {
                new sistema.Estudiante("Ana Torres", 20, "EST-001",
                        "Ingeniería en Sistemas", 4),
                new Profesor("Roberto Díaz", 38, "PRO-001",
                        "Programación", 25000.00),
                new sistema.Administrador("Laura Méndez", 32, "ADM-001",
                        "Servicios Escolares", "Coordinadora")
        };

        // El mismo método ejecuta una versión distinta según el objeto real.
        for (Persona persona : personas) {
            persona.mostrarInformacion();
        }

        System.out.println("\n===== PRUEBA DE ENCAPSULAMIENTO =====");
        Persona prueba = new sistema.Estudiante("Luis Pérez", 21, "EST-002",
                "Informática", 3);

        // Se consulta y modifica el atributo privado usando getter y setter.
        System.out.println("Edad inicial: " + prueba.getEdad());
        prueba.setEdad(22);
        System.out.println("Edad actualizada: " + prueba.getEdad());

        // El atributo public puede consultarse directamente.
        System.out.println("Identificador público: " + prueba.identificador);

        // El atributo protected se utiliza dentro de Persona y sus hijas.
        System.out.println("Nombre obtenido mediante getter: " + prueba.getNombre());

        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}

