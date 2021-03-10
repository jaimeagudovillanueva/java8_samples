package jaime.functionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
	
	static BiFunction<List<Integer>, Predicate<Integer>, Map<Integer, Integer>> biFunction = 
		(numbers, numberPredicate) -> {
			Map<Integer,Integer> numberMap = new HashMap<>();
			numbers.forEach(number -> {
				if (numberPredicate.test(number)) {
					numberMap.put(number, number);
				}
			});
			return numberMap;
	};

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
		System.out.println( biFunction.apply(numbers, PredicateExample.p3));
	}
}
