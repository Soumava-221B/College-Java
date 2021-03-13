package Structure;

import java.util.*;

public class LinkedList_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>l=new LinkedList<String>();
		l.add("Ram");
		l.add("Raja");
		l.add("Ramaya");
		System.out.println("after add() method: "+l);
		//specific position  change the string 
		l.add(0, "Soumava");
		System.out.println("at particular position: "+l);
		
		LinkedList<String>l2=new LinkedList<>();
		l2.add("Suman");
		l2.add("Anjali");
		l.addAll(l2);
		System.out.println("after combinig of two linked list: "+l);
		//adding first position
		l.addFirst("Ananiya");
		System.out.println("after addfirst method(): "+l);
		l.addLast("Rituraj");
		System.out.println("after addlast method(): "+l);
		//remove elements
		l.removeLast();
		System.out.println("after remove method: "+l);
		l.removeLast();
		System.out.println("after remove last element: "+l);

	}

}
