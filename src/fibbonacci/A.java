package fibbonacci;
import java.util.*;
import java.io.*;
public class A {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				if(arr[i]<arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
	}

}
