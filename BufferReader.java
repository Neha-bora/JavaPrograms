import java.io.*;
 public class BufferReader{

public static void main (String [] args) throws IOException
 { 
 	int ch;
    
 
 	BufferedReader br = new BufferedReader ( new FileReader("myfile.txt")  );

 	while((ch= br.read() )!=-1){
 		System.out.print( (char)ch );
 	}
 
  br.close();

 }
}
