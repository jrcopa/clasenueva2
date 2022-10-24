package funciones;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class ComparaTiempos {
    /**
     * Esta funcion compara un horario unico con un rango de horarios
     * @param hu Horario para comparar
     * @param ti Inicio del rango
     * @param tf Final del rango
     * @return true si esta dentro del rango, falso en el caso contrario
     */
    public static boolean compara(String hu, String ti, String tf){
        LocalTime tiempoInicio = LocalTime.parse(ti);
        LocalTime tiempoFin = LocalTime.parse(tf);
        LocalTime tiempoUsuario = LocalTime.parse(hu);
        
        if (tiempoUsuario.isAfter(tiempoInicio) && tiempoUsuario.isBefore(tiempoFin) || tiempoUsuario.equals(tiempoInicio)){
            return true;
        } else {
            return false;
        }
    }

    public static void nada (){}
}
