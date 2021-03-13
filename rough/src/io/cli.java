package io;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cli {

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		int number, temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1", 1342);
		Scanner sc1 = new Scanner(s.getInputStream());
		//System.out.println("Enter any number");
		//number = sc.nextInt();
		System.out.println("Enter your Name");
		String name = sc.next();
		
		PrintStream p = new PrintStream(s.getOutputStream());
		//p.println(number);
		p.println(name);
		
		//temp = sc1.nextInt();
		//System.out.println(temp);
		String io = sc1.next();
		System.out.println(io);
	}

}
