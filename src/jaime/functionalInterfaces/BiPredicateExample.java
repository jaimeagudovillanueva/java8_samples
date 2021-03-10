package jaime.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	static BiPredicate<Integer, String> biPredicate = (age, name) -> {
		return age > 18 && !name.isEmpty();
	};
	
	public static void main(String[] args) {
		System.out.println(biPredicate.test(19, "Carlos"));
		
		System.out.println(biPredicate.test(12, "Manuel"));
		
		System.out.println(biPredicate.test(12, null));
	}
}
