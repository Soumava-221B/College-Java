/*
 * Write a Java program to search a value in a Tree Map.
 */
package Structure;

import java.util.TreeMap;

public class ContainTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tm= new TreeMap<Integer,String>();
		tm.put(1, "a");
		tm.put(2, "bb");
		System.out.println(tm);
		
        if(tm.containsKey(1)){
            System.out.println("The Tree Map contains key a");
        } else {
            System.out.println("The Tree Map does not contain key a");
        }
		

	}

}
