package DirectoryFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class StatusCheck {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter out = new FileWriter("Newfile2.txt");
		out.write("Test file status is readble and writeable");
		out.close();
		status("Newfile2.txt");

	}
	public static void status(String fileName) throws IOException
	{
		System.out.println("..."+ fileName+"...");
		
		File f=new File(fileName);
		System.out.println("File Name:"+f.getName());
		
		if(!f.exists())
		{
			System.out.println("file not found");
			System.out.println();
			return;
		}
		
		System.out.println("Canonical name: "+f.getCanonicalPath());
		
		String p = f.getParent();
		System.out.println("parent directory: "+f.getParent());
		if(p !=null)
			System.out.println("Parent directory: " + p);
	
	// Check if the file is readable
	if (f.canRead()) {
	System.out.println("File is readable.");
	}
	// Check if the file is writable
	if (f.canWrite()) {
	System.out.println("File is writable.");
	}
	// Report on the modification time.
	Date d = new Date(f.lastModified());
	System.out.println("Last modified " + d);
	// See if file, directory, or other. If file, print size.
	if (f.isFile()) {
	// Report on the file's size
	System.out.println("File size is " + f.length() + " bytes.");
	} else if (f.isDirectory()) {
		System.out.println("It's a directory");
		} else {
		System.out.println("I dunno! Neither a file nor a directory!");
		}
		System.out.println(); // blank line between entries
	}

}
