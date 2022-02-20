package primeNumber;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int num=s.nextInt();
		int temp=0;
		for(int i=2; i<=num/2; ++i) {
			if(num%i==0) {
				temp++;
			}
		}
		if(temp==0) {
			System.out.println("its a prime number");
		}
		else {
			System.out.println("its not a prime number");
		}
	}

}
