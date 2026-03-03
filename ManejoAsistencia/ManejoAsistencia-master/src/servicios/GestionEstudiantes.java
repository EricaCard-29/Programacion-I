package servicios;

import datos.Asistencia;
import datos.Estudiante;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;
    //constructor
    public GestionEstudiantes(){
        this.estudiantes = new ArrayList<>();
    }
    public void adicionar(long nose, String cualquiera, String apellido){
        // crea instancia de Estudiante
        Estudiante elestud = new Estudiante();
        // Adiciono los datos de entrada a los atributos
        elestud.codigo = nose;
        elestud.nombre = cualquiera;
        elestud.apellido = apellido;
        // adiciono la instancia creada con datos a la lista.
        this.estudiantes.add(elestud);
    }
    public void adicionarAsistencia(long codigo, Date fecha){
        Asistencia asistencia = new Asistencia();
        asistencia.asistio = true;
        asistencia.fecha = fecha;

        for(Estudiante ele : this.estudiantes){
            if(ele.codigo == codigo){
                ele.asistencias.add(asistencia);
                System.out.println("Inscribio");
            }
        }
    }
    public void imprimirListaGeneral(){
        System.out.println(" LISTA GENERAL ");
        System.out.println(" - - -- - - -- - - - ");
        System.out.println(" codigo   |  nombre  | apellido   ");

        for (Estudiante estudiante: estudiantes){
            System.out.println(estudiante.codigo+ "  | "+ estudiante.nombre +" | "+ estudiante.apellido);
        }
    }
    public void imprimirListaAsistencia(){
        System.out.println(" LISTA GENERAL ");
        System.out.println(" - - -- - - -- - - - ");
        System.out.println(" codigo   |  nombre  | apellido | total  ");


        for (Estudiante estudiante: estudiantes){
            int conteo = 0;
            int total = estudiante.asistencias.size();
            for (Asistencia asistencia: estudiante.asistencias){
                if (asistencia.asistio == true){
                    conteo ++;
                }
            }
            System.out.println(estudiante.codigo+ "  | "+ estudiante.nombre +" | "+ estudiante.apellido + " | "+ conteo+"/"+total);

        }
    }
    public void imprimirEstudiante(long codigo){
        Optional<Estudiante> elEstudiante = estudiantes.stream()
                .filter(p -> p.codigo == codigo)
                .findFirst();
        if (elEstudiante.isPresent())
            System.out.println(elEstudiante);
        else
            System.out.println("No existe");
    }

}
