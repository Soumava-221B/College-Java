/*
 * WAP to convert the ArrayList into Array                                    // 11-12-20
 */
package Structure;

import java.util.ArrayList;

public class ConvertArray_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> number=new ArrayList<>();
		number.add(123);
		number.add(345);
		number.add(987);
		System.out.println("ArrayList: "+number);
		
		Integer arr[]=new Integer[number.size()];
		number.toArray(arr);
		System.out.println("Array: ");
		for(Integer i:arr)
			System.out.println(i+";");

	}

}
