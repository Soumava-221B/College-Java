package Number;

import java.lang.*;

public class ObjectTypeWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primitive = 100;  //primitive type
		
		Integer obj=new Integer(primitive);  //boxing
		int j=obj.intValue();  //unboxing
		System.out.println(j);
		
		long lg=obj.longValue();
		System.out.println(lg);
		
		double db=obj.doubleValue();
		System.out.println(db);
		
	    String io=obj.toString();
	    System.out.println(io);

	}

}
