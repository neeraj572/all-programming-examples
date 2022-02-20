package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class A {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		for(int i=1; i<=10; i++) {
			linkedList.add(i);
		}
//		linkedList.remove(5);
//		linkedList.add(5,12);
//		System.out.println(linkedList.get(6));
//		boolean c = linkedList.contains(6);
//		System.out.println(c);
		Iterator<Integer> itr = linkedList.iterator();
//		while(itr.hasNext()) {
//			if(itr.next()==5)
//			itr.remove();
//		}
		System.out.println(linkedList);
	}

}
