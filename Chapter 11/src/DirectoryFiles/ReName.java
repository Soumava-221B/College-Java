package DirectoryFiles;

import java.io.File;

public class ReName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Construct the file object. Does NOT create a file on disk!
		File f =new File ("input.txt");
		
		// Rename the backup file to "junk.dat"
		f.renameTo(new File("junk.dat"));

	}

}
