package Structure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrrayList_RExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>fruit = new ArrayList<String>();
		fruit.add("Banna");
		fruit.add("orange");
		fruit.add("Apple");
		System.out.println("ArrayList elements: "+fruit);
		fruit.add("graphs");
		System.out.println("set new value: "+fruit);
		fruit.set(1, "papaya");
		System.out.println("set new value: "+fruit);
		fruit.remove(2);
		System.out.println("after remove: "+fruit);
		
		System.out.println();
		for(int i=0;i<fruit.size();i++)
		{
			System.out.println("size of array: "+fruit.get(i));
		}
		//other
		for(String i:fruit)
			System.out.println(i);
		// integer value
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(102);
		number.add(20);
		number.add(450);
		number.add(01);
		Collections.sort(number);
		for(int i:number)
		{
			System.out.println("Sorted integer value: "+i);
		}
		

	}

}
