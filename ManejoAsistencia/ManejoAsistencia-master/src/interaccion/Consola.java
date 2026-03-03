package interaccion;

import util.Utilidades;

import java.util.Date;
import java.util.Scanner;

public class Consola {
    public long leerNumero(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje+" : ");
        long numero = sc.nextLong();
        return numero;

    }
    public String leerCadena(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje+" : ");
        String cadena = sc.nextLine();
        return cadena;

    }
    public String leerCaracter(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje+" : ");
        String cadena = sc.next();
        return cadena;

    }
    public Date leerFecha(String mensaje){
        String fechaS = this.leerCadena(mensaje);
        Utilidades util = new Utilidades();
        Date fecha = util.convertirStringDate(fechaS);
        return fecha;
    }
}
