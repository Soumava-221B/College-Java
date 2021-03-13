package io;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Console con = System.console();
		if(con == null)
		{
			System.err.print("No console available");
			return;
		}
		
		str = con.readLine("Enter your name: ");
		con.printf("Here is your name %s \n", str);
		
		//To read password and then display it
		System.out.println("Enter the password: ");
		char[] ch=con.readPassword();
		
		String pass = String.valueOf(ch);
		System.out.println("Password is: " + pass);
	}

}
