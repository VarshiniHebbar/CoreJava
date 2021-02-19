package test;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int i=0;
			int j=10/i;
			System.out.println("Hi rohan");
			
		}catch (ArithmeticException e) {
			System.out.println("cant devide");
			
		}
		System.out.println("After Exception");
		
	}

}
