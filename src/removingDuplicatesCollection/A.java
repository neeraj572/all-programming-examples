package removingDuplicatesCollection;

import java.util.LinkedHashSet;

public class A {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,3,4};
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			lh.add(arr[i]);
		}
		System.out.println(lh);
	}

}
