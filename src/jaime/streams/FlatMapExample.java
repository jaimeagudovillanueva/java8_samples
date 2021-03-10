package jaime.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import jaime.data.Student;
import jaime.data.StudentDataBase;

public class FlatMapExample {
	
	public static List<Student> sortStudentsByName() {
		
		List<Student> studentActivities = StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		
		return studentActivities;
	}
	
	public static List<Student> sortStudentsByNameReversed() {
		
		List<Student> studentActivities = StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName).reversed())
				.collect(Collectors.toList());
		
		return studentActivities;
	}

	public static void main(String[] args) {
		
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(studentActivities);
		
		sortStudentsByName().forEach(System.out::println);
		sortStudentsByNameReversed().forEach(System.out::println);
	}
}
