import java.io.*; 
import java.io.IOException;
public class FileExample
{
	public static void main(String [] args) throws IOException
	{
		File f1 = new File("java/name1.txt");
		f1.createNewFile();
		System.out.println("Is exist: " + f1.exists());
	}
}