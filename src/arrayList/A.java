package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
		arrayList.add(i);
		}
		
		Iterator<Integer> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		arrayList.add(9,11);
//		System.out.println(arrayList.get(4));
//		arrayList.remove(3);
//		boolean contains = arrayList.contains(5);
//		System.out.println(contains);
		System.out.println(arrayList);
	}

}
