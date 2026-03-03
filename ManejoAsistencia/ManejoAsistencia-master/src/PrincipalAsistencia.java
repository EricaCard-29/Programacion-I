import interaccion.Consola;
import servicios.GestionEstudiantes;

import java.util.Date;

public class PrincipalAsistencia {
    public static void main(String[] blue){
        System.out.println("Iniciando programa");
        boolean finaliza = false;
        Consola consola = new Consola();
        GestionEstudiantes gestion = new GestionEstudiantes();

        while(!finaliza){
            // leer datos 1
            // registrar asistencia 2
            // buscar asistencia de un estudiante 3

            System.out.println("1 - Digite para registrar estudiante");
            System.out.println("2 - Digite para registrar asistencia");
            System.out.println("3 - Digite para listar total de estudiantes");
            System.out.println("4 - Digite para listar asistencia");

            String opcion = consola.leerCadena("Digite su opción  ");
            int opcionAjustadaEntero = Integer.parseInt(opcion.trim());
            switch (opcionAjustadaEntero){
                case 1:
                    long codigo = consola.leerNumero("Digite su código");
                    String nombre = consola.leerCadena("Digite su nombre");
                    String apellido = consola.leerCadena("Digite su apellido");
                    gestion.adicionar(codigo, nombre, apellido);
                    break;
                case 2:
                    long codigoEst = consola.leerNumero("Digite su código");
                    Date lafecha = consola.leerFecha("Digite fecha de asistencia formato dd/MM/yyyy");
                    gestion.adicionarAsistencia(codigoEst,lafecha);
                    break;
                case 3:
                    gestion.imprimirListaGeneral();
                    break;
                case 4:
                    gestion.imprimirListaAsistencia();
                    break;
                default:
                        ;
            }

            String opcionS = consola.leerCadena("Desea salir S/N");
            if (opcionS.equalsIgnoreCase("S")) {
                finaliza = true;
            }
            else {
                finaliza = false;
            }
        }//while (!finaliza);

        System.out.println("Finalizando programa");

    }
}
