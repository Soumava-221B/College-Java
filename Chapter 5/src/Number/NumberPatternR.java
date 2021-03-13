																						//  21-11-20
package Number;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class NumberPatternR {

	public static void main(String[] args) {
		NumberFormat nf=new DecimalFormat("####.####");
		double d=1234.56789;
		System.out.println(nf.format(d));
		
		NumberFormat nf1=new DecimalFormat("00000.##");
		System.out.println(nf1.format(d));
		
		NumberFormat nf2=new DecimalFormat("##,###.###");
		System.out.println(nf2.format(d));
		
		DecimalFormat df=new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		
		System.out.println("decimal format of double: "+df.format(d));
		
		NumberFormat nf3=new DecimalFormat("%###.###");
		System.out.println(nf3.format(d));

	}

}
