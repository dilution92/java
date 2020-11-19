package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Application {

	public static void main(String[] args) {

		try (final FileInputStream fis = new FileInputStream("C:\\Users\\user1\\Desktop\\dog.jpg");
			final FileOutputStream fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\dog_copy.jpg");
				)
		{
			// fis - ���� ����
			final byte[] buffer = new byte[4096];
			int result; // ���� ����Ʈ �� ����
			while ((result = fis.read(buffer)) != -1) {
				// fos - �� ����
				fos.write(buffer);
				System.out.println("���� ����Ʈ ��: "+result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
