package arrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class B {
	public static void main(String[] args) {
		List <Integer> l=new ArrayList<Integer>();
	for(int i=0; i<10; i++) {
		l.add(i);
	}
		Collections.synchronizedList(l);
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			if(itr.next()%2!=0) {
			System.out.println(itr.next());
			}
			else {
				itr.remove();
			}
			
		}
	}

}
