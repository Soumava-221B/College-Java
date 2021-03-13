package io;
import java.util.Scanner;

public class Nebula {
	 static int highestPowerof2(int n) 
	   { 
	     int res = 0; 
	     for (int i = n; i >= 1; i--) 
	        { 
	         // If i is a power of 2 
	          if ((i & (i - 1)) == 0) 
	             { 
	                  res = i; 
	                break; 
	             } 
	        } 
	     return res; 
	   } 

	public static void main(String[] args) {
		/*Scanner dayno = new Scanner(System.in);
		System.out.println("Enter today's day no: ");
		int dy = dayno.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int nextdy = dayno.nextInt();
		
		int futureday = ((dy=nextdy)%7);

		switch (dy)
		{
		   case 0 : System.out.print("Today is Sunday");break;
		   case 1 : System.out.print("Today is Monday");break;
		   case 2 : System.out.print("Today is Tuesday");break; 
		   case 3 : System.out.print("Today is Wednesday");break; 
		   case 4 : System.out.print("Today is Thursday");break; 
		   case 5 : System.out.print("Today is Friday");break; 
		   case 6 : System.out.print("Today is Saturday");break; 
		}
		switch (futureday)
		{
		   case 0 : System.out.print(" and the future day is Sunday");break;
		   case 1 : System.out.print(" and the future day is Monday");break;
		   case 2 : System.out.print(" and the future day is Tuesday");break; 
		   case 3 : System.out.print(" and the future day is Wednesday");break; 
		   case 4 : System.out.print(" and the future day is Thursday");break; 
		   case 5 : System.out.print(" and the future day is Friday");break; 
		   case 6 : System.out.print(" and the future day is Saturday");break; 
			
		}*/
		/*Scanner gameison =  new Scanner(System.in);
		System.out.print("Enter '0' for SCISSOR, '1' for ROCK & '2' for PAPER: " );
		
		int player1 = gameison.nextInt();
	switch(player1)
	{
	case 0: System.out.print("You are SCISSOR.");break;
	case 1: System.out.print("You are ROCK.");break;
	case 2: System.out.print("You are PAPER.");break;
	}

		int computer = 0 + (int)((2-0)*Math.random());
		
	switch(computer)
	{
	case 0: System.out.print(" "+"The computer is SCISSOR.");break;
	case 1: System.out.print(" "+"The computer is ROCK.");break;
	case 2: System.out.print(" "+"The computer is PAPER.");break;
	}

	if(computer == player1)
		System.out.print(" "+"It is DRAW");
	else if((computer==2 && player1==0) || (computer==1 && player1==2) ||(computer==0 && player1==1) )
	    System.out.print(" "+"You WON.");
	else
		System.out.print(" "+"You lose.");
		*/
		Scanner sc=new Scanner(System.in);
		int n;
		double s=0,res=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		/*int x=0;
		int v=1;;
		while(v<=n)
		{
		x=v;
		v=v*2;
		}
		System.out.println(x);
         */
		//int n = 10; 
	      System.out.println(highestPowerof2(n)); 
		
		}

	}


