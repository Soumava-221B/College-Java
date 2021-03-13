/*
 * Write a Java program to store text file content line by line into an array.
 */
package program;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class q5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arijit das\\1941012676 CSW-1\\Assingment\\src\\q1.txt"));
              while (strLine != null)
               {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                   break;
                list.add(strLine);
            }
         System.out.println(Arrays.toString(list.toArray()));
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

	}

}
