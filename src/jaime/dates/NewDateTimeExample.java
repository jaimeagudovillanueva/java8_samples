package jaime.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class NewDateTimeExample {

	public static void  main(String[] args) {
		
		//LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate: " + localDate);
		
		localDate = LocalDate.of(2018, 7, 12);
		System.out.println("localDate: " + localDate);
		System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));
		System.out.println(localDate.plusDays(2));
		
		//Localtime
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: " + localTime);
		localTime = LocalTime.of(18, 25, 50);
		System.out.println("localTime: " + localTime);
		System.out.println(localTime.getMinute());
		System.out.println(localTime.minusHours(2));
		
		//LocalDateTime
		LocalDateTime localDatetime = LocalDateTime.now();
		System.out.println("localDateTime: " + localDatetime);
		localDatetime = LocalDateTime.of(2018, 3, 21, 23, 30, 42);
		System.out.println("localDateTime: " + localDatetime);
		
		// Conversiones
		LocalDateTime tiempo = localTime.atDate(localDate);
		LocalDate fecha = tiempo.toLocalDate();
		LocalTime hora = tiempo.toLocalTime();
		System.out.println(fecha + " " + hora);
	}
}
