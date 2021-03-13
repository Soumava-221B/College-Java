package InputOutput;

import java.io.IOException;
import java.io.PrintStream;

public class Reassigning_R {

	public static void main(String[] args) throws IOException{
		System.out.println("Section E");
		System.out.println("SECTION Q");
		PrintStream ps=new PrintStream("error.lob");
		System.setOut(ps);
		System.out.println("SECTION R");
		System.out.println("SECTION ALL");
		System.setErr(ps);
		int a[]=new int[5];
		a[10]=0;
		ps.close();
	}

}
