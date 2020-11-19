package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Application {

	public static void main(String[] args) {

		try (final FileInputStream fis = new FileInputStream("C:\\Users\\user1\\Desktop\\dog.jpg");
			final FileOutputStream fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\dog_copy.jpg");
				)
		{
			// fis - 읽을 파일
			final byte[] buffer = new byte[4096];
			int result; // 읽은 바이트 수 저장
			while ((result = fis.read(buffer)) != -1) {
				// fos - 쓸 파일
				fos.write(buffer);
				System.out.println("읽은 바이트 수: "+result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
