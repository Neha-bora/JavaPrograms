import java.io.*;
public class FileOutput{
  
	public static void main (String [] args) throws IOException
	{
		 int i ;
		 FileOutputStream fout = new FileOutputStream ("./myfile.txt" , true);
		 String s = " i like to gathering new new things";
		 char ch[] = s.toCharArray();
		 for (i= 0 ; i<s.length() ; i++)
		 	fout.write(ch[i]);
		 fout.close();
	}
}