package jaime.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String,String> mayusculas = (name) -> name.toUpperCase();
	
	// Using Method Reference
	static Function<String,String> mayusculasMetRef = String::toUpperCase;
	
	static Function<String,String> addSomeString = (name) -> name.concat("default");

	public static void main(String[] args) {
		System.out.println("Result is: " + mayusculas.apply("jaime"));
		
		System.out.println("Result is: " + mayusculas.andThen(addSomeString).apply("jaime"));
		
		System.out.println("Result is: " + mayusculas.compose(addSomeString).apply("jaime"));
		
		System.out.println("Result is: " + mayusculasMetRef.apply("jaime"));
	}
}
