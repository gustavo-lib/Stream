import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("java.pdf");

	    FileOutputStream fis = new FileOutputStream(file);

	    ByteArrayOutputStream bos = new ByteArrayOutputStream();

	    byte[] buf = new byte[1024];

	    for (int readNum; (readNum = fis.read(buf)) != -1; ){
	        bos.write(buf, 0, readNum);
	    }
		
	}

}
