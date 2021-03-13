															// 11-12-20
package Structure;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_R {
	enum days{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enumeration Days;
		Vector week=new Vector();
		week.add("Sunday");
		week.add("Monday");
		Days=week.elements();
		while(Days.hasMoreElements())
		{
			System.out.println("Day="+Days.nextElement());
		}
		
		System.out.println("Enum keyword display output:\n");
		for(days d:days.values())
		{
			System.out.println(d);
		}

	}

}
