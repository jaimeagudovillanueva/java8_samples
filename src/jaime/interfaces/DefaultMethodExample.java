package jaime.interfaces;

import java.util.Arrays;
import java.util.List;

public class DefaultMethodExample {

	public static void main(String[] args) {
		
		Multiplier multiplier = new MultiplierImpl();
		List<Integer> integerList = Arrays.asList(1, 3, 5);
		
		System.out.println(multiplier.multiply(integerList));
		System.out.println("Size is: " + multiplier.size(integerList));
		
	}
}
