														// 11-12-20
package Structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_set_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>l=new ArrayList<Integer>();
		//Set<Integer>s=new HashSet<Integer>();
		l.add(1);    // considering integer value
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(6);
		l.add(6);
		System.out.println("print integer using List interface: ");
		for(Integer in:l)
			System.out.println(in);
		Set<Integer>s=new HashSet<Integer>();
		s.add(1);    // set does not consider the duplicate values
		s.add(2);
		s.add(3);
		s.add(5);
		s.add(6);
		s.add(6);
		
		System.out.println("print integer using Set: ");
		for(Integer i:s)
			System.out.println(i);
	}

}
