package Structure;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>l=new LinkedList<>();
		l.add(new Object().toString());
		l.add("Hello");
		l.add("ITER");
		l.add("SOA");
		l.add("end of the List");
		System.out.println("forward direction elements: ");
		ListIterator li=l.listIterator(0);
		while(li.hasNext())
			System.out.println("next element: "+li.next());
		
		if(l.indexOf("Hello")<0)
			System.err.println("look up does not work: ");
		else 
			System.err.println("lookup works");
		
		while(li.hasPrevious())
		{
			System.out.println("BACK to: "+li.previous());
		}
		System.out.println();
		

	}

}
