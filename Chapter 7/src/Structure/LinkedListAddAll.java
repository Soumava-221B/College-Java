package Structure;                              // 04-01-21                             
import java.util.*;

public class LinkedListAddAll {

	public static void main(String[] args) {
		LinkedList<String>c1=new LinkedList<String>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		System.out.println("1st linked list: "+c1);
		
		LinkedList<String>cc2=new LinkedList<String>();
		cc2.add("d");
		cc2.add("e");
		cc2.add("f");
		System.out.println("2nd linked list: "+cc2);
		
		LinkedList<String>l=new LinkedList<String>();     // adding two string
		l.addAll(c1);                                        
		l.addAll(cc2);
		System.out.println("New Linked List: "+l);
		

	}

}
