package swapingNumbers;

public class A {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("before swapping a is "+ a + " b is "+ b);
		a=a+b-(b=a);
		System.out.println("after swaping a is "+ a +" b is "+ b);
	}

}
