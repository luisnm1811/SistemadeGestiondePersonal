package sistema;

import java.util.ArrayList;

/** Clase hija que representa a un estudiante. */
public class Estudiante extends Persona {
    private String carrera;
    private int semestre;

    // ArrayList: permite almacenar una lista dinámica de materias.
    private ArrayList<String> materias = new ArrayList<>();

    public Estudiante(String nombre, int edad, String identificador,
                      String carrera, int semestre) {
        super(nombre, edad, identificador); // Invoca el constructor padre.
        this.carrera = carrera;
        this.semestre = semestre;
        materias.add("Estructura de datos");
        materias.add("Programación orientada a objetos");
    }

    // Sobrescritura: comportamiento específico para un estudiante.
    @Override
    public void mostrarInformacion() {
        System.out.println("ESTUDIANTE | " + nombre + " | Edad: " + getEdad()
                + " | ID: " + identificador + " | Carrera: " + carrera
                + " | Semestre: " + semestre + " | Materias: " + materias);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
