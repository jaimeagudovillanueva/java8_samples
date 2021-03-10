package jaime.functionalInterfaces;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierExample {

	static Supplier<Integer> integerSupplier = () -> {
		return (int) (Math.random() * 100);
	};
	
	// Con ConstructorReference
	static Supplier<Date> dateSuppConst = Date::new;
	
	static Function<Long, Date> dateCreationFunction = Date::new;
	

	public static void main(String[] args) {
		System.out.println(integerSupplier.get());
		
		System.out.println(dateSuppConst.get());
		
		System.out.println(dateCreationFunction.apply(1567894L));
	}
}
