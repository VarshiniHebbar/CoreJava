package test;

public class PrimeNum {
	public static void main(String[] args) {
		int n=11;
		int m=n/2;
		for(int j=2; j<m;j++) {
			if(n%j==0) {
				System.out.println(" not Prime");
				break;
			}
			
			else {
			System.out.println("Prime");
			break;
		}
		
		}
	}
}


