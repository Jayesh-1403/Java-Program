package FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("C:\\Java\\xyz.txt");
		int i;
		while ((i = reader.read()) != -1) {
			;
		System.out.print((char) i);
	}
	reader.close();
}
}