import java.io.*;
public class ThrowsFile {
 public static void main(String[] args) throws IOException
 {
	 FileWriter file = new FileWriter("d:\\Data1.txt");
	 file.write("jkhjksdf");
	 file.close();
 }
}
