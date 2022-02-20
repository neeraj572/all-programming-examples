package palindrome;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		System.out.println("enter any number to check wheather its palindrome or not:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num=n;
		int rev=0,rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(num==rev) {
			System.out.println("its a palindrome number");
		}
		else {
			System.out.println("its not a palindrome number");
		}
	}

}
