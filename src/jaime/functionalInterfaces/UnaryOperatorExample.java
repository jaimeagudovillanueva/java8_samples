package jaime.functionalInterfaces;

import java.util.function.UnaryOperator;

/**
 * Como un Function pero cuando la entrada y la salida son del mismo tipo
 * @author jagudo
 *
 */
public class UnaryOperatorExample {

	static UnaryOperator<String> unaryOperator = s -> s.concat("Default");
	
	public static void main(String[] args) {
		System.out.println(unaryOperator.apply("Jaime"));
	}
}
