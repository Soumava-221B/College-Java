/*
 * Write a Java program to write and read a plain text file.
 */
package program;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class q6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "C:\\Users\\arijit das\\1941012676 CSW-1\\Assingment\\src\\q1.txt";
             FileWriter fw = new FileWriter(filename,false); 
             //appends the string to the file
             fw.write("Python Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arijit das\\1941012676 CSW-1\\Assingment\\src\\q1.txt"));
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();                          
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }

	}

}
