package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;

public class TokenizerExample_R {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream re=new FileInputStream("C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 10\\src\\inputstream.txt");
		StreamTokenizer tz=new StreamTokenizer(re);
		while(tz.nextToken()!=StreamTokenizer.TT_EOF)
		{
			System.out.println(tz.sval);
		}
		

	}

}
