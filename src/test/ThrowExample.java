package test;

public class ThrowExample {
	public static void main(String[] args) {
		
		try {
			int age = 11;
			if(age<18) {
				throw new ArithmeticException("not valid");
			
			}
			else {
				System.out.println("welcome to note");
			}
		}catch(ArithmeticException e) {
			System.out.println("exception handled");
		}
		
		
		
	}
}
		
	
	


