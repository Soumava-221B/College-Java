package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RedaingFileToStrnig {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 10\\src\\input.txt");
		BufferedReader br=new BufferedReader(fr);
		StringBuilder sb=new StringBuilder();
		String line=null;
		while((line=br.readLine())!=null)
		{
			sb.append(line);
			sb.append("\n");
			sb.append(true);
			sb.append("CSE R");
			sb.append(2);
			sb.delete(2,3);
			sb.replace(2, 3, "here");
			
		}
		String content=sb.toString();
		System.out.println(content);
		System.out.println("successful");

	}

}
