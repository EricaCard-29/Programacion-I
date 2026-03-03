package datos;

import java.util.ArrayList;

public class Estudiante {
    public long codigo;
    public String nombre;
    public String apellido;
    public ArrayList<Asistencia> asistencias = new ArrayList<>();

    @Override
    public String toString() {
        return "El estudiante código "+codigo+ "se llama "+nombre+" "+apellido;
    }
}
