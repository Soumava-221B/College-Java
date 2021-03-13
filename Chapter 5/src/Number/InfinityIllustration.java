     																								// 16-11-20
package Number;

import java.lang.*;

public class InfinityIllustration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1 = Double.NaN;
		System.out.println("NAN: "+d1);
		
		double d2 = Double.POSITIVE_INFINITY;
		System.out.println("Possitive: "+d2);
		
		double d3 = Double.NEGATIVE_INFINITY;
		System.out.println("Negative: "+d3);
		
		float f2 = Float.POSITIVE_INFINITY;
		System.out.println("Positive: "+f2);
		
		float f3 = Float.NEGATIVE_INFINITY;
		System.out.println("Negative: "+f3);

		double d= 0.0/0.0;
		System.out.println("return true if it is 0 or not define in maths:- "+Double.isNaN(d));
		
		d = Math.sqrt(-1.2);
		System.out.println(Double.isNaN(d));
		
		float f = 0.0f/0.0f;
		System.out.println(Float.isNaN(f));
		
		f = 0*Float.POSITIVE_INFINITY;
		System.out.println(Float.isNaN(f));
		
		double d11 = Double.POSITIVE_INFINITY / 0.0;
		System.out.println("Use isInfinite method():- "+Double.isInfinite(d11));
		
		d11 = Double.NEGATIVE_INFINITY / 0.0;
		System.out.println(Double.isInfinite(d11));
		
		float f22 = Float.NEGATIVE_INFINITY * 4.12F;
		System.out.println(Float.isInfinite(f22));
		
		
	}

}
