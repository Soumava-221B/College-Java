package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
			FileReader in=null;
			FileWriter out=null;
		     
			in=new FileReader("C:/Users/arijit das/1941012676 CSW-1/Chapter 10/src/Jam.txt");
		     out=new FileWriter("Output.txt");
		     	     
		     int c;
		     while((c=in.read())!=-1)
		     {
		    	 out.write(c);
		     }
		     System.out.println("sucessfully out in file");

		     in.close();
		     out.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
