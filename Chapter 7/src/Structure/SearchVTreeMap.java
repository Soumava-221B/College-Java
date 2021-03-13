/*
 * Write a Java program to search a value in a Tree Map
 */
package Structure;

import java.util.TreeMap;

public class SearchVTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String,String> tree_map1=new TreeMap<String,String>();
		
		  tree_map1.put("A", "Jhon");
		  tree_map1.put("B", "Wick");
		  tree_map1.put("C", "Tenet");
		  tree_map1.put("D", "Inception"); 
		  
		  System.out.println(tree_map1);
	        if(tree_map1.containsKey("A")){
	            System.out.println("The Tree Map contains key Jhon");
	        } else {
	            System.out.println("The Tree Map does not contain key Jhon");
	        }
	        if(tree_map1.containsKey("E")){
	            System.out.println("The Tree Map contains key E");
	        } else {
	            System.out.println("The TreeMap does not contain key E");
	        }

	}

}
