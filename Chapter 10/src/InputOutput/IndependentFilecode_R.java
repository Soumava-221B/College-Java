package InputOutput;

import java.io.File;

public class IndependentFilecode_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myname="Faculty";
		String out="BADNEWLINEDEMO"+"\n"+myname;
		System.out.println(out);
		
		//correct Format
		System.out.println("bad demo line");
		System.out.println(myname);
		String location="C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 10\\src\\inputstream.txt";
		String filelocation=location+File.separator+"Filewriter.txt";
		System.out.println(filelocation);

	}

}
