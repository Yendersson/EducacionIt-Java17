package clase1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Testing {
	public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        // Restar días hasta encontrar un lunes
        while (fechaActual.getDayOfWeek() != DayOfWeek.MONDAY) {
            fechaActual = fechaActual.minusDays(1);
        }

        // Ahora tenemos la fecha del último lunes pasado
        System.out.println("Último lunes pasado: " + fechaActual.getDayOfMonth());
    }
}
