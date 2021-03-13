package DirectoryFiles;
import java.io.File;
import java.io.IOException;

public class TransientFileExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = null;
		try {
			f = File.createTempFile("tmp", ".tmp",null);
			
			System.out.println("File path: "+f.getAbsolutePath());
			
			f.deleteOnExit();
			
			f= File.createTempFile("tmp", ".txt",null);
			
			System.out.println("File path: "+f.getAbsolutePath());
			
			f.deleteOnExit();
		} catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
