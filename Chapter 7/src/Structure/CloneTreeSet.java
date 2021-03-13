package Structure;                      

import java.util.TreeSet;

public class CloneTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>t=new TreeSet<String>();
		t.add("Arpita");
		t.add("Soumava");
		t.add("Kriti");
		// sop
		System.out.println("Treeset string value:"+t);
		TreeSet clonename = new TreeSet();
		clonename= (TreeSet)t.clone();
		System.out.println("the clone treeset: "+clonename);

	}

}
