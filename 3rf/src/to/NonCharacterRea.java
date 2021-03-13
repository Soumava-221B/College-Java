/*
 * Remeber all the charactre should be small 
 */
package to;
import java.util.Scanner;

public class NonCharacterRea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        String x=sc.next();
        
        for(int i=0;i<x.length();i++)
        {
        	int count=0;
        	for(int j=i+1;j<x.length();j++)
        	{
        		if(x.charAt(i)==x.charAt(j)) {
        			count++;
        		}
        	}
        	if(count!=0)
        	{
        		System.out.println(x.charAt(i));
        		break;
        	}
        }
	}

}
