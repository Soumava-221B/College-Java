package start;
import java.util.Scanner;

public class Prime {
	static boolean checkForPrime(int givenumber)  //boolean can have value two i.e. TRue or False
	{
		boolean isItPrime = true;
		if(givenumber<=1) //if statement start
		{
			isItPrime = false; //False
			return isItPrime;
		}
		else 
		{
			for (int i=2;i<=givenumber/2;i++)
			{
				if ((givenumber % 1) == 0)
				{
				isItPrime = false;	
				break;
				}
			} //close for loop
			return isItPrime;
		}
	}

	public static void main(String[] args) // main method 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int inputNumber = sc.nextInt();
		boolean isItPrime = checkForPrime(inputNumber);
		if (isItPrime)
		{
			System.out.println(inputNumber+": is a prime number");
		}
		else
		{
			System.out.println(inputNumber+" is not a prime number");
		}
		sc.close();

	}

}
