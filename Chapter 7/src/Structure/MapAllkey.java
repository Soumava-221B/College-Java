/*
 * Write a Java program to get all keys from the given a Tree Map.
 */
package Structure;

import java.util.Set;
import java.util.TreeMap;

public class MapAllkey {

	public static void main(String[] args) {
		
		TreeMap<Integer, String>allkey= new TreeMap<Integer, String>();
		allkey.put(1, "a");
		allkey.put(2, "b");
		allkey.put(3, "c");
		Set<Integer>k=allkey.keySet();
		System.out.println("all the key from the given:");
		for(Integer kk:k)
		{
			System.out.println(kk);
		}
		System.out.println(allkey);

	}

}
