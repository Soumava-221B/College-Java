package DirectoryFiles;

import java.io.File;

public class createfileNewMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f= new File("ABCD.txt");
			if(f.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File alreday exists");
			
		}
		catch (Exception e)
		{
			System.err.println(e);
		}

	}

}
