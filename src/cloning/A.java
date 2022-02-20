package cloning;

public class A implements Cloneable {  //cloneable is a marker interface which tells the compiler to give clonning feature
	public static void main(String[] args) {
		A a1=new A();
		try {
			A a2=(A)a1.clone(); //clone() returns optional 
			System.out.println(a1);
			System.out.println(a2);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	}

}
