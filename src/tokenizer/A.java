package tokenizer;

import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) {
		StringTokenizer str =new StringTokenizer("my name is Neeraj Kumar"," ");  //after the string we are writing double quotes based
		                                                         //on which string is being splitted that is called delimiter
		int num=0;
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			num++;
		}
		System.out.println(num);
	}

}
