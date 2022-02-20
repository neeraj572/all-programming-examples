package removingDuplicateFromArray;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,4,5,2,6,4,7,8};
		Arrays.sort(arr);
		int[] a=new int[arr.length];
		int temp=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				a[temp]=arr[i];
				temp++;
			}
		}
		a[temp+1]=arr[arr.length-1];
	for(int j=0; j<=temp; j++) {
		System.out.print(a[j]);
		System.out.print(" ");
	}
		
	}

}
