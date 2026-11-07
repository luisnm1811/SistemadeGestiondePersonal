package sistema;

import java.util.LinkedList;

/** Clase hija que representa a un profesor. */
public class Profesor extends sistema.Persona {
    private String especialidad;
    private double salario;

    // LinkedList: lista enlazada para organizar los grupos asignados.
    private LinkedList<String> grupos = new LinkedList<>();

    public Profesor(String nombre, int edad, String identificador,
                    String especialidad, double salario) {
        super(nombre, edad, identificador);
        this.especialidad = especialidad;
        this.salario = salario;
        grupos.add("Grupo A");
        grupos.add("Grupo B");
    }

    // Sobrescritura del método de la clase padre.
    @Override
    public void mostrarInformacion() {
        System.out.println("PROFESOR | " + nombre + " | Edad: " + getEdad()
                + " | ID: " + identificador + " | Especialidad: "
                + especialidad + " | Salario: $" + salario
                + " | Grupos: " + grupos);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
