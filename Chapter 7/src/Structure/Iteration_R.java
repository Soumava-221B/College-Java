																// 11-12-20
package Structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteration_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String>c=new ArrayList<String>();
		c.add("Sartak");
		c.add("Kumarrita");
		c.add("Ananya");
		c.forEach(s->System.out.println(s)); // java 8
		
		String data[]= {"Ram", "Sham"};  // java 5
		for(String s:data)
			System.out.println(s);
		
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(1);
		i.add(3);
		i.add(4);
		for(Integer ii:i)
		{
			System.out.println(ii);
		}
		
		for(int j=0;j<i.size();j++)
		{
			System.out.println(i);
		}
		Iterator<Integer>it=i.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
