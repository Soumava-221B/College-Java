																						//23-11-20
package Number;

import java.util.BitSet;

public class Integerseries {
	

	public static void main(String[] args)  {		
		String months []= {
				"January" , "Febuary" , "March" , "April" ,  "May", "June" , 
				"July" , "August" , "September" , "October" , "November" , "December"
		};
		for(int i=0;i <months.length ;i++)
		{
			System.out.println(" Month "+months[i]);
		}
		//
		//
		System.out.println("using the bitset");
		BitSet b = new BitSet();
		b.set(0);
		//January
		b.set(3);
		//April
		b.set(8);
		//September
		//Presumably thus would be somewhere else in the code
		for(int i=0;i<months.length;i++)
		{
			if(b.get(i))
			System.out.println(" Month "+months[i]);
		}
		
		//Same example but shorter
		
	 System.out.println("another way using the array");
	 int[] numbers = {0, 3, 8};
	 
	 for(int n : numbers) {
		 System.out.println("Month: "+months[n]);
	 }
	 BitSet b1=new BitSet();
	 BitSet b2=new BitSet();
	 b1.set(23);
	 b1.set(0);
	 b1.set(4);
	 b1.set(78);
	 b1.set(54);
	 System.out.println("b1 :"+b1);
	 System.out.println("b2 :"+b2);
	 
	}	}	 




