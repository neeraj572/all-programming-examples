package armstrong;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int rem,arm=0;
	    while(num!=0) {
	    	rem=num%10;
	    	arm=arm+rem*rem*rem;
	    	num=num/10;
	    }
	    if(temp==arm) {
	    	System.out.println("its a palindrome number");
	    }
	    else {
	    	System.out.println("its not a palindrome number");
	    }
		
	}

}
