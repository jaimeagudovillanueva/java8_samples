package jaime.interfaces;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		MathOperation add = (a,b) -> a + b;
		System.out.println(add.operation(5, 6));
		
		MathOperation multiply = (a,b) -> a * b;
		System.out.println(multiply.operation(5, 6));
	}
}
