package collection;

import java.util.Map;
import java.util.HashMap;
public class A {
	public static void main(String[] args) {
		Map<Integer,String> studentInfo=new HashMap<>();
		studentInfo.put(100,"pankaj");
		studentInfo.put(101,"ravi");
		studentInfo.put(102, "sam");
		System.out.println(studentInfo);
		System.out.println(studentInfo.get(102));
		System.out.println(studentInfo.values());
		System.out.println(studentInfo.keySet());
	}

}
