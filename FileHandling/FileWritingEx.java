package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream = new FileOutputStream("C:\\Java\\abs.txt",true);
		String str = "Welcome to Edubridge!";
		byte bArr[] = str.getBytes();//converting str-byte[]
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("file created");
	}

}

