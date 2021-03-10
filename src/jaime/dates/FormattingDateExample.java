package jaime.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateExample {

	public static void parseLocalDateGeneric() {
		String date = "2020-03-10";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate: " + localDate);
	}
	
	public static void parseLocalDateSpecific() {
		String date = "03/10/2020";
		LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("localDate specific: " + localDate);
	}
	
	public static void formatLocalDate() {
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate formatted: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	
	public static void parseLocalTimeGeneric() {
		String time = "13:00";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("localTime: " + localTime);
	}
	
	public static void formatLocalTime() {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime formatted: " + localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
	}
	
	public static void formatLocalTimeSpecific() {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime formatted: " + localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
	}
	
	public static void parseLocalDateTime() {
		String time = "2020-03-10T13:00:00";
		LocalDateTime localDateTime = LocalDateTime.parse(time);
		System.out.println("localDateTime: " + localDateTime);
	}
	
	public static void formatLocalDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime formatted: " + localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}
	
	public static void formatLocalDateTimeSpecific() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime formatted: " + localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
	}
	
	public static void main(String[] args) {
		parseLocalDateGeneric();
		parseLocalDateSpecific();
		formatLocalDate();
		
		parseLocalTimeGeneric();
		formatLocalTime();
		formatLocalTimeSpecific();
		
		parseLocalDateTime();
		formatLocalDateTime();
		formatLocalDateTimeSpecific();
	}
}
