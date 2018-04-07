package myPackage.S7;
/**
 * This class reads a file and prints to the user all the lines that it could contain
 */
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
			
		try {
			/**
			 * @param myFile create an File Object from "MyFile.txt"
			 */
			File myFile = new File("MyFile.txt");

            BufferedReader br = new BufferedReader(new FileReader(myFile));

            String line = "";

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
