package ifElse;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int num=s.nextInt();
		if(num%2==0 && num>0 && num<10) {
			System.out.println("its even number and between 0 to 10");
		}
		else if(num%2==0 && num>10 && num<100) {
			System.out.println("its an even number and present between 10 to 100");
			
		}
		else {
			System.out.println("its an odd number");
		}
	}

}
