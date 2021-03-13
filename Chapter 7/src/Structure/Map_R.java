package Structure;

import java.util.HashMap;
import java.util.Map;

public class Map_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String>m=new HashMap<Integer, String>();
		m.put(1, "Abhishek");
		m.put(2, "Anshuman");
		m.put(3, "Ayush");
		m.put(4, "Adam");
		m.put(5, "Thor");
		m.put(6, "Captain America");
		for(Map.Entry i:m.entrySet())
		System.out.println(i.getKey()+" "+i.getValue());

	}

}
