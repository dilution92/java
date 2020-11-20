package bufferedreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("C:\\Users\\user1\\Desktop\\README.txt.md");
			final InputStreamReader isr = new InputStreamReader(in);
			final BufferedReader br = new BufferedReader(isr);
			
			System.out.println("v: "+ br.readLine());
			System.out.println("v: "+ br.readLine());
			System.out.println("v: "+ br.readLine());
			System.out.println("v: "+ br.readLine());
			System.out.println("v: "+ br.readLine());
			System.out.println("v: "+ br.readLine());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
