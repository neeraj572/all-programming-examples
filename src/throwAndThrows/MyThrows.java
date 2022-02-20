package throwAndThrows;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyThrows {
	public static void main(String[] args) {
		MyThrows a=new MyThrows();
		try {
			a.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void test ()throws Exception {
		File f=new File("D://jackdaniel//Neeraj.txt");
		FileReader fw=new FileReader(f);
		for(int i=0; i<f.length(); i++) {
		System.out.print((char)fw.read());
		}
	}

}
