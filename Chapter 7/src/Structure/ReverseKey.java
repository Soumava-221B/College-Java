/*
 * Write a program to get a reverse order view of the keys contained in a given map.
 */
package Structure;

import java.util.TreeMap;

public class ReverseKey {

	public static void main(String[] args) {
		
		TreeMap<String,String>tm=new TreeMap<String,String>();
		tm.put("a", "aa");
		tm.put("a3", "hello");
		tm.put("a2", "ITER");
		System.out.println("content without change: "+tm);
		System.out.println("reverse order of key: "+tm.descendingKeySet());
		System.out.println();
		
		TreeMap<Integer,String>km=new TreeMap<Integer,String>();
		km.put(1, "z");
		km.put(4, "w");
		km.put(7, "t");
		System.out.println("content without change: "+km);
		System.out.println("reverse order of key: "+km.descendingKeySet());

	}

}
