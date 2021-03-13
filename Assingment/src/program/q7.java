/*
 * Write a Java program to Copy a file into another file using Byte-Stream Class.
 */
package program;
import java.io.*; 
import java.util.*; 

public class q7 {
	public static void copyContent(byte[] a, File b) 
	        throws IOException 
	    { 
		ByteArrayInputStream in = new ByteArrayInputStream(a); 
		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
	  
	        try { 
	  
	            int n; 
	  
	            // read() function to read the 
	            // byte of data 
	            while ((n = in.read()) != -1) { 
	                // write() function to write 
	                // the byte of data 
	                out.write(n); 
	            } 
	        } 
	        finally { 
	            if (in != null) { 
	  
	                // close() function to close the 
	                // stream 
	                in.close(); 
	            } 
	            // close() function to close 
	            // the stream 
	            if (out != null) { 
	                out.close(); 
	            } 
	        } 
	        System.out.println("File Copied"); 
	    } 

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); 
		  
	        // get the source file name 
	        System.out.println( 
	            "C:\\Users\\arijit das\\1941012676 CSW-1\\Assingment\\src\\q7Read.txt"); 
	        String a = sc.nextLine(); 
	  
	        // source file 
	        File x = new File(a); 
	  
	        // get the destination file name 
	        System.out.println( 
	            "C:\\Users\\arijit das\\1941012676 CSW-1\\Assingment\\src\\q7WriteCopy.txt"); 
	        String b = sc.nextLine(); 
	  
	        // destination file 
	        File y = new File(b); 
	  
	        // method called to copy the 
	        // contents from x to y 
	        copyContent(x, y); 
		

	}

	private static void copyContent(File x, File y) {
		// TODO Auto-generated method stub
		
	}

}
