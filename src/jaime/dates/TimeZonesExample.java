package jaime.dates;

import java.util.Date;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesExample {

	public static void main(String[] args) {
		ZonedDateTime zonedDatetime = ZonedDateTime.now();
		System.out.println("zonedDateTime: " + zonedDatetime);
		
		System.out.println("zoneOffset: " + zonedDatetime.getOffset());
		
		System.out.println("zoneId: " + zonedDatetime.getZone());
		
		ZoneId.getAvailableZoneIds().forEach(System.out::println);
		
		System.out.println("Hora en Chicago: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		
		System.out.println("ZonedDateTime using clock: " + ZonedDateTime.now(Clock.system(ZoneId.of("Europe/Madrid"))));
		
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
		System.out.println("Detroit: " + localDateTime);
		
		// Converting LocalDateTime
		LocalDateTime localDateTime2 = LocalDateTime.now();
		localDateTime2.atZone(ZoneId.of("America/Chicago"));
		
		ZonedDateTime zonedDateTime2 = localDateTime2.atZone(ZoneId.of("America/Detroit"));
		System.out.println(zonedDateTime2);
		
		// Converte java.util.Date
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		localDate = localDate.minusDays(2);
		date = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(date);
	}
}
