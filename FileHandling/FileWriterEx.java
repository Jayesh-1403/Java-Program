package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 FileWriter writer = new FileWriter("C:\\Java\\xyz.txt", true);
 writer.write("File writer example");
 writer.close();
	}

}
