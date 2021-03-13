package DirectoryFiles;

import java.io.File;

public class Delete {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (String file : args)
			delete(file);
		}
	public static void delete(String fileName)
	{
		try {
			File target = new File(fileName);
			if(!target.exists()) {
				System.err.println("File "+ fileName+ "not present to begin with!");
				return;
			}
			
			if(target.delete())
			System.err.println("** Delete "+ fileName+""
					+ "**");
			else
				System.err.println("Failed to delete "+ fileName);
		}
		catch(SecurityException e) {
			System.err.println("Unable to delete "+fileName+"("+e.getMessage()+")");
		}
	}

	}
