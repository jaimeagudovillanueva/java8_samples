package jaime.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		
		// Con Method Reference
		Consumer<String> c1MetRef = System.out::println;
		
		c1.accept("java8");
		
		c1MetRef.accept("java8");
	}
}
