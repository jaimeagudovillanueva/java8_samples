package jaime.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import jaime.data.Student;
import jaime.data.StudentDataBase;

public class StreamsExample {
	
	static Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
	static Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;

	public static void main(String[] args) {

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.filter(studentPredicate)
				.filter(studentGpaPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentMap);
	}
}
