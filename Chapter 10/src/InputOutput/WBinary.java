package InputOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WBinary {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("Binary.txt");
		DataOutputStream dos=new DataOutputStream(fos); //using dataoutputStream we can write the binary value
		dos.writeBoolean(true);
		dos.writeInt(98765);
		dos.writeFloat(12.034f);
		dos.writeChars("A");
		//docs.writeBytes("Thoot");
		dos.close();
		fos.close();
		
		System.out.println("success");

	}

}
