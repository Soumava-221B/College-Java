package Structure;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add("kolkata");
		al.add("bhubaneshwar");
		al.add("delhi");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

	}

}
