package InputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RWBinary_R {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int i=12;
		double d=Math.PI;
		String FILENAME="BinaryExample.dat";
		
		FileOutputStream fos=new FileOutputStream(FILENAME);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(i);
		dos.writeDouble(d);
		dos.close();
		System.out.println("Write the binary data: "+i+","+d+"to file"+FILENAME);
		
		//reading data
		FileInputStream fis=new FileInputStream(FILENAME);
		DataInputStream dis=new DataInputStream(fis);
		System.out.println("Read the data"+dis.readInt()+"and ");
		System.out.println(dis.readDouble()+"from binary example.dat file");
		dis.close();

	}

}
