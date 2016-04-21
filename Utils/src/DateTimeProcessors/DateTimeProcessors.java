package DateTimeProcessors;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeProcessors {
 
    public String ObtenerFechaHoraActual()
    {
        String retorno;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date fecha = new Date();
        retorno = dateFormat.format(fecha);
        return retorno;
    }
}
