import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();

		int nRead;
		byte[] data = new byte[16384];

		while ((nRead = is.read(data, 0, data.length)) != -1) {
			buffer.write(data, 0, nRead);
		}

		return buffer.toByteArray();

	}

}
