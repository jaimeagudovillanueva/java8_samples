package jaime.functionalInterfaces;

public class FunctionExample1 {

	public static String performConcat(String str) {
		return FunctionExample.addSomeString.apply(str);
	}
	
	public static void main(String[] args) {
		
		System.out.println(performConcat("Hello"));
	}
}
