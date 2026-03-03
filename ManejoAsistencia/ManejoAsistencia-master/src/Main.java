import datos.Asistencia;
import datos.Estudiante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void mainx(String[] abc) {
        // 1542 LUNA ROJAS
        Estudiante elestud = new Estudiante();
        elestud.codigo = 1542;

        elestud.apellido = "ROJAS";

        System.out.println(elestud.codigo);
        System.out.println(elestud.nombre);
        System.out.println(elestud.apellido);
        // imprimir la instancia invocara el metodo toString
        System.out.println(elestud);

        Asistencia unaasis = new Asistencia();

    }
}