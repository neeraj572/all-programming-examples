package primeNumber;

public class B {
	public static void main(String[] args) {
		int temp=0;
		System.out.println("all prime numbers are");
		for(int i=1; i<=100; i++) {
			for(int j=2; j<=i/2; ++j) {
				if(i%j==0) {
					temp++;
				}
			}
			if(temp==0) {
				System.out.print(i+ " ");
			}
			else {
				temp=0;
			}
		}
		
	}

}
