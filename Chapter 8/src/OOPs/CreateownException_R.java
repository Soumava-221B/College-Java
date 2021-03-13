package OOPs;

import java.util.Scanner;

public class CreateownException_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number between 1 to 10");
	try
	{
		int num=input.nextInt();
		if(num<1||num>10)
		{
			throw new InvalidException("not a valid number");
		}
		else
		{
			System.out.println("valid number");
		}
	}catch(InvalidException e)
	{
		System.out.println(e.getMessage());
	}

	}

}
