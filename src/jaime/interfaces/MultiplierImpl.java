package jaime.interfaces;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	public int multiply(List<Integer> integerList) {
		
		return integerList.stream().reduce(1, (x, y) -> x*y);
	}
	
	public int size(List<Integer> integerList) {
		System.out.println("Inside Multiplier Interface");
		return integerList.size();
	}
}
