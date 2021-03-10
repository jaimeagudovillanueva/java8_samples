package jaime.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDurationInstantExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2018, 1, 1);
		LocalDate localDate2 = LocalDate.of(2018, 12, 31);
		
		// Period
		Period period = localDate.until(localDate2);
		System.out.println(period.getDays()); // solo comprueba los días dentro del mes
		System.out.println(period.getMonths()); // solo comprueba los meses
		System.out.println(period.getYears());
		
		Period period1 = Period.ofDays(10);
		System.out.println("Periodo de 10 dias");
		System.out.println(period1.getDays()); 
		System.out.println(period1.getMonths()); 
		System.out.println(period1.getYears());
		
		Period period2 = Period.between(localDate, localDate2);
		System.out.println("Period: " + period2.getDays() + " : " + period2.getMonths() + " : " + period2.getYears());
		
		// Duration
		Duration duration = Duration.between(LocalTime.now(), LocalTime.now().plusHours(6));
		System.out.println(duration.toMinutes());
		
		// Instant
		Instant instant = Instant.now();
		System.out.println(instant);
	}
}
