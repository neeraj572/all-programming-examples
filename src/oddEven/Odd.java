package oddEven;

import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2!=0) {
			System.out.println("its and odd number");
		}
		else {
			System.out.println("its even");
		}
	}

}
