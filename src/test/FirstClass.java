package test;

public class FirstClass {

	int age;
	String Name;
	float salary;
	
	public void Display() {
		System.out.println("Inside display");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("hello world");
		SecondClass obj1 = new SecondClass();
		obj1.Show("rahul");
		SecondClass obj2 = new SecondClass();
		obj2.Show("manjunath");
		obj2.Calculate();

	}

}
