package InputOutput;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="chukhu";
		Console con= System.console();
		
		if(con == null)
		{
			System.err.print("No console available");
			return;
		}
		System.out.println(str);
		
		str = con.readLine("Enter your userID: ");
		con.printf("Here is your name: %s\n",str);
		
		System.out.println("Enter the password");
		//char[]=

	}

}
