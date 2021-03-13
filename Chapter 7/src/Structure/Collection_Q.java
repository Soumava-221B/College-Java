																		// 11-12-20
package Structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection values=new ArrayList();
		values.add(3);
		values.add("Soumava");
		values.add(90.234f);
		System.out.println(values);
		
		//ge
		Collection<Integer> val=new ArrayList<Integer>();
		val.add(23);
		val.add(700);
		//val.add("Ram");
		System.out.println(val);
		//using iterator
		
		Iterator<Integer>i=val.iterator();
		System.out.println("iterator value: "+i.next());
		
		for(int inval:val)
		{
			System.out.println("enchance for loop: "+inval);
		}
		while(i.hasNext())
		{
			System.out.println("while loop: "+i.next());
		}

	}

}
