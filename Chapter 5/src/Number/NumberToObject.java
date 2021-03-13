package Number;

public class NumberToObject {

	public static void main(String[] args) {
		
		Integer i =new Integer(10);
		System.out.println("int to integer class convert: "+i.toString());
		
		//convert integer to int
		int ii=i.intValue();
		System.out.println("Object to integer: "+ii);

	}

}
