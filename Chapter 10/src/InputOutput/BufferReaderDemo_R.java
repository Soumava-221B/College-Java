package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReaderDemo_R {

	public static void main(String[] args) throws Exception{
		//file writer
		FileWriter w=new FileWriter("OUT.txt");
		BufferedWriter bf=new BufferedWriter(w);
		bf.write("Welcome cseq");
		bf.close();
		System.out.println("success bufferedwriter:");
		
		//file reader
		
		FileReader fr=new FileReader("C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 10\\src\\input.txt");
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
		}
		br.close();
		fr.close();

	}

}
