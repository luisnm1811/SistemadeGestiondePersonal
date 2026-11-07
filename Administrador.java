package sistema;

import java.util.HashMap;
import java.util.HashSet;

/** Clase hija que representa al personal administrativo. */
public class Administrador extends Persona {
    private String departamento;
    private String puesto;

    // HashSet: almacena permisos sin permitir elementos duplicados.
    private HashSet<String> permisos = new HashSet<>();

    // HashMap: relaciona claves (áreas) con sus responsables.
    private HashMap<String, String> responsables = new HashMap<>();

    public Administrador(String nombre, int edad, String identificador,
                         String departamento, String puesto) {
        super(nombre, edad, identificador);
        this.departamento = departamento;
        this.puesto = puesto;
        permisos.add("Consultar registros");
        permisos.add("Actualizar registros");
        permisos.add("Consultar registros"); // No se duplica en HashSet.
        responsables.put("Escolar", "María López");
        responsables.put("Finanzas", "Carlos Ruiz");
    }

    // Sobrescritura: muestra la información administrativa.
    @Override
    public void mostrarInformacion() {
        System.out.println("ADMINISTRADOR | " + nombre + " | Edad: " + getEdad()
                + " | ID: " + identificador + " | Departamento: "
                + departamento + " | Puesto: " + puesto
                + " | Permisos: " + permisos
                + " | Responsables: " + responsables);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

