package jaime.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejemplos {
	
	static Consumer<Integer> pintarInteger = numero -> System.out.print(numero);
	static Consumer<Integer> pintarConguion = numero -> System.out.println(numero + "-");

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(0, 100).sum();

		List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
		integerList.forEach(pintarInteger.andThen(pintarConguion));

		List<Integer> uniqueList = integerList.stream().distinct()
				.collect(Collectors.toList());
		
		
		
		integerList.stream().filter(n -> n > 5).peek(pintarInteger).collect(Collectors.toList());
		

		System.out.println("Suma :" + sum);
	}
}
