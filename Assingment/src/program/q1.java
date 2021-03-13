/*
 * Write a Java program to read contents from a file into byte array.
 */
package program;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class q1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String file_name = "C:\\Users\\arijit das\\1941012676 CSW-1\\Assingment\\src\\q1.txt";
        InputStream fins = null;
        try {
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fins != null) fins.close();
            } catch(Exception ex){
                 
            }
        }

	}

}
