import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File file = new File("src/java.pdf");

			
		      FileInputStream fis = new FileInputStream(file);
		      byte [] data = new byte[(int)file.length()];
		      fis.read(data);
		      ByteArrayOutputStream bos = new ByteArrayOutputStream();
		      data = bos.toByteArray();
		      System.out.println(data.toString());/**/
			
		}
		catch(Exception e){System.out.println(e);}
		
		
	}

}
