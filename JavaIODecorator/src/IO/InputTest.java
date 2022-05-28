package IO;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;

public class InputTest {
	
public static void main(String[] args) throws IOException{ 
	 int c; 
	 
	 try { 
		 InputStream in = new LowerCaseInputStream(new BufferedInputStream(new fileInputStream()));
		 	
		 while((c = in.read()) >= 0) { 
			 System.out.println((char)c);
		 }
	 in.close(); 
	 }catch (IOException e ) { 
		 e.printStackTrace();
	 }
}

}
