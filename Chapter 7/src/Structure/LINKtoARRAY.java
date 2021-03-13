package Structure;                        // 04-01-21
import java.util.*;

public class LINKtoARRAY {

	public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		List<Integer>al=new ArrayList<Integer>(l);  
		
		System.out.println("Array List:"+al);
		for(Object i:al)
		{
			System.out.println(i);
		}

	}

}
