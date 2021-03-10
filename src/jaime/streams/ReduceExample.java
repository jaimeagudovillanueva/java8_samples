package jaime.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import jaime.data.Student;
import jaime.data.StudentDataBase;

public class ReduceExample {

	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
				// a=1 b=1 (del stream) => devuelve 1
				// a=1 b=3 (del stream) => devuelve 3
				// a=3 (de lo que va calculado), b=5 (del stream) => devuelve 15
				// a=15 (de lo que va calculado), b=7 (del stream) => devuelve 105
				.reduce(1,  (a,b) -> a * b);
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentiy(List<Integer> integerList) {
		return integerList.stream()
				.reduce((a,b) -> a * b);
	}
	
	public static Optional<Student> getHighestGPAStudent() {
		return StudentDataBase.getAllStudents().stream()
			.reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
	}
	
	public static double getSumGPA() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getGpa)
				.reduce(0.0, Double::sum);
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,3,5,7);
		System.out.println(performMultiplication(integers));
		
		Optional<Integer> resultado = performMultiplicationWithoutIdentiy(integers);
		if (resultado.isPresent()) {
			System.out.println(resultado.get());
		} else {
			System.out.println("Sin resultado");
		}
		
		Optional<Student> student = getHighestGPAStudent();
		if (student.isPresent()) {
			System.out.println(student.get());
		} else {
			System.out.println("Sin resultado");
		}
		
		System.out.println(getSumGPA());
	
	}
}
