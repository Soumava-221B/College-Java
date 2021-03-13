package to;
import java.util.*;
public class Stoken {

	public static void main(String[] args) {
		System.out.println("using constructor-1");
		StringTokenizer str1=new StringTokenizer("hello Shawn to java class","");
		
		while(str1.hasMoreTokens())  // 1st constructor 
		{
			System.out.println(str1.nextToken());
			System.out.println("using constructor-2 with next element");
			StringTokenizer str2=new StringTokenizer("hello |miss me, are in nextelement[2]","|");
			while(str2.hasMoreElements())   // 2nd constructor 
			{
				System.out.println("Token:"+str2.nextToken());
				
				System.out.println("using constructor-3 with the boolean flag");
				
				StringTokenizer str3=new StringTokenizer("hello, now! |we are in India","|",true);
				
				while(str3.hasMoreElements())    // 3rd constructor
				{
					System.out.println("Token:"+str3.nextToken());
				}
			}
		}

	}

}
