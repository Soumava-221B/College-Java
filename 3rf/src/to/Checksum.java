package to;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
public class Checksum {

	public static void main(String[] args) throws Exception{
	  String filepath="C:\\Users\\arijit das\\1941012676 CSW-1\\3rf\\src\\to\\Checksum.txt";
	  
	  MessageDigest md=MessageDigest.getInstance("SHA1");
	  FileInputStream fput = new FileInputStream(filepath);
	  byte dataBytes[]=new byte[1024];
	  int bytesRead=0;
	  while((bytesRead=fput.read(dataBytes))!=-1)
	  {
		  md.update(dataBytes,0,bytesRead);
	  }
	  byte digestBytes[]=md.digest();

	  StringBuffer sb=new StringBuffer("");
	  for(int i=0;i<digestBytes.length;i++)
	  {
		  sb.append(Integer.toString((digestBytes[i] & 0xff) + 0x100, 16).substring(1));
	  }
	  System.out.println("Checksum for the File: " + sb.toString());
	  fput.close();
	}

}
