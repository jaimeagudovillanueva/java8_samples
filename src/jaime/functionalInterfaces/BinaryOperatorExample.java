package jaime.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	
	static BinaryOperator<Integer> binaryOperator = 
		(number1, number2) -> number1 * number2;
		
	static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
	
	static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

	public static void main(String[] args) {
		
		System.out.println( binaryOperator.apply(3, 5));
		
		System.out.println( maxBy.apply(3, 5));
		
		System.out.println( minBy.apply(3, 5));

	}
}
