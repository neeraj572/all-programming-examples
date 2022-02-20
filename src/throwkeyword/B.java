package throwkeyword;

import java.util.Scanner;

public class B {
	static int amount=500;
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		int n=scan.nextInt();
		if(n>amount) {
			try {
				throw new A();
			}catch(A e) {
								System.out.println("insufficient funds");
			}
		}
		else {
			System.out.println("take your money ="+ n);
			amount=amount-n;
			System.out.println("remaining balance is "+ amount);
		}
	}

}
