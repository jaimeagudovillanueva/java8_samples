package jaime.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import jaime.data.Student;
import jaime.data.StudentDataBase;

public class ParalleStreamExample {

	public static void  main(String[] args) {
		
		// Parallel no siempre es más eficiente que los stream secuenciales. 
		// En casos en los que hay unboxing o boxing de datos por ejemplo de Integer a int
		// realiza esa transformación en todos los procesadores para todos los datos.
		
		// Tampoco se debe usar cuando se realizan acciones que dependen de variables mutables. 
		// Por ejemplo una suma acumulativa.
		System.out.println(IntStream.rangeClosed(1,  100000)
				.parallel()
				.sum());
		
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()
				.parallel()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(studentActivities);
	}
}
