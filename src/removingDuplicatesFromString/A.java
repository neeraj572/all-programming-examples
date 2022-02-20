package removingDuplicatesFromString;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class A {
	public static void main(String[] args) {
		String str="neerajj";
		char[] ch=new char[str.length()-1];
		for(int i=0; i<str.length()-1; i++) {
			ch[i]=str.charAt(i);
		}
		LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
		for(int i=0; i<ch.length; i++) {
			lh.add(ch[i]);
		}
		Iterator<Character> itr = lh.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}
