package jaime.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> p1 = i -> { return i%2 == 0;};
	
	static Predicate<Integer> p2 = i -> i%2 == 0;
	
	static Predicate<Integer> p3 = i -> i%5 == 0;
	
	// Con Method Reference
	static Predicate<Integer> p1MetRef = PredicateExample::numeroPar;
	
	public static boolean numeroPar(Integer number) {
		return number%2 == 0;
	}
	
	public static void predicateAnd() {
		System.out.println(p2.and(p3).test(10));
	}
	
	public static void predicateOr() {
		System.out.println(p2.or(p3).test(10));
	}
	
	public static void predicateNegate() {
		System.out.println(p2.or(p3).negate().test(10));
	}

	public static void main(String[] args) {
		
		System.out.println(p1.test(4));
		
		predicateAnd();
		predicateOr();
		predicateNegate();
	}
}
