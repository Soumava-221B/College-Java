package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileinputStream_R {

	public static void main(String[] args) 
	{
		try {
	     FileInputStream in=new FileInputStream("C:/Users/arijit das/1941012676 CSW-1/Chapter 10/src/Jam.txt");
	     FileOutputStream out=new FileOutputStream("Output.txt");
	     
	     FileOutputStream obj=new FileOutputStream("output.txtCSEQ.txt");
	     String s="Hello everyone Q";
	     byte b[]=s.getBytes();
	     obj.write(b);
	     obj.close();
	     
	     int c;
	     while((c=in.read())!=-1)
	     {
	    	 out.write(c);
	     }
	     System.out.println("sucessfully out in file");

	}catch(Exception e)
	{
		System.out.println(e);
	}
}

}
