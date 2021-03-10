package jaime.streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import jaime.data.Student;
import jaime.data.StudentDataBase;

public class TerminalOperationsExample {

	public static void main(String[] args) {
		
		// JOINING
		final String nombres = StudentDataBase.getAllStudents().stream()
			.map(Student::getName)
			.collect(Collectors.joining());
		
		System.out.println(nombres);
		
		final String nombresGuion = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining("-"));
		
		System.out.println(nombresGuion);
		
		final String nombresPrefijoSufijo = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining("-", "(", ")"));
		
		System.out.println(nombresPrefijoSufijo);
		
		// COUNTING
		final long count = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() > 2.0)
				.collect(Collectors.counting());
		
		System.out.println(count);
		
		// MAPPING
		final List<String> namesList = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println(namesList);
		
		// MAX BY / MIN BY
		final Optional<Student> minStudent = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
		
		System.out.println(minStudent.get());
		
		final Optional<Student> maxStudent = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
		
		System.out.println(maxStudent.get());
		
		// GROUP BY
		final Map<String, List<Student>> groupByGenderStudents = 
				StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(groupByGenderStudents);
		
		
		final Map<String, List<Student>> groupByGpaStudents = 
				StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println(groupByGpaStudents);
		
		// TWO ARGUMENT GROUP BY
		final Map<Integer, Map<String, List<Student>>> groupDoubleParamStudents = 
				StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
						Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
		System.out.println(groupDoubleParamStudents);
		
		final Map<Integer, Integer> countGradeLevelGrouped = 
				StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
						Collectors.summingInt(Student::getGradeLevel)));
		System.out.println(countGradeLevelGrouped);
		
		// THREE ARGUMENT GROUP BY
		final LinkedHashMap<String, Set<Student>> groupTripleParamStudents = 
				StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, 
						LinkedHashMap::new,
						Collectors.toSet()));
		System.out.println(groupTripleParamStudents);
		
		// PARTITIONING BY
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
		
		final Map<Boolean, List<Student>> partitionByStudents = 
				StudentDataBase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(gpaPredicate));
		System.out.println(partitionByStudents);
	}
}
