package jaime.optional;

import java.util.Optional;

import jaime.data.Student;
import jaime.data.StudentDataBase;

public class OptionalExample {

	public static void main(String[] args) {
		
		// OfNullable
		Optional<Student> optional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		// Present
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		String nombre = optional.map(Student::getName).orElse("Sin nombre");
		System.out.println(nombre);
		
		// If Present
		optional.ifPresent(student -> System.out.println(student));
		optional.ifPresent(System.out::println);
		
		Optional<Student> optional2 = Optional.ofNullable(null);	
		// Or Else
		String nombre2 = optional2.map(Student::getName).orElse("Sin nombre");
		// Or Else Get
		String nombre3 = optional2.map(Student::getName).orElseGet(() -> "Sin nombre");
		System.out.println(nombre2);
		System.out.println(nombre3);
		
		// Filter 
		optional.filter(student -> student.getGpa() >= 4.0).ifPresent(System.out::println);
		
		if (optional.isPresent()) {
			// Map
			Optional<String> strOptional = optional.map(Student::getName);
			System.out.println(strOptional.get());
		}

	}
}
