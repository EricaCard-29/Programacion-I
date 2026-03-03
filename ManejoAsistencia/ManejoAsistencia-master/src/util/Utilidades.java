package util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    public Date convertirStringDate(String fechaS){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formato.parse(fechaS);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto.");
        }
        return null;
    }
}
