package Number;

import java.math.BigDecimal;
import java.math.BigInteger;


public class MaxValueLong {

	public static void main(String[] args) {
		System.out.println("integer value: "+Long.MAX_VALUE);
		System.out.println("Double values: "+Double.MAX_VALUE);
		
		BigInteger b1 = new BigInteger("1234567890"); 
		BigInteger b2 = new BigInteger("987654321");
		BigInteger b3 = new BigInteger("89");
			
		System.out.println("BigInteger number: "+b1);
		
		System.out.println("BigInteger number: "+b2);
		
		BigInteger b11 = b1.abs();
		System.out.println("Absoulute value: "+b11);
		BigInteger b22=b1.add(b3);
		System.out.println("add "+b22);
		BigInteger b33 = b1.multiply(b3);
		System.out.println("multi: "+b33);
		
		BigInteger b44=b1.subtract(b2);
		System.out.println("subtract: "+b44);
		BigInteger b55=b3.divide(b1);
		System.out.println("divide: "+ b55);
		
		BigInteger b66=b1.pow(2);
		System.out.println("divide: "+ b66);
		
		BigInteger b77=b1.negate();
		System.out.println("negative value: "+b77);
		BigInteger bb= new BigInteger("89");
		Boolean b88=b3.equals(bb);
		System.out.println(b88);
		
		int b99 = b1.compareTo(b3);
		System.out.println("compare to value "+b99);
		
		int vl=b1.intValue();
		System.out.println("Integer value: "+vl);
		float f=b1.floatValue();
		System.out.println("floating point: "+f);
		
		BigDecimal b41 = new BigDecimal("16473"); 
		BigInteger b42 = new BigInteger("96234679780");
		BigInteger b43 = new BigInteger("67");
		
		System.out.println("BigDecimal: "+b42);
		System.out.println("BigDecimal: "+b42);
		System.out.println("BigDecimal: "+b43);
		
		//BigDecimal b71=

	}

}
