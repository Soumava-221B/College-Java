															// 20/11/20
package Number;

public class RoundNumberR {

	public static void main(String[] args) {
		double x=5423.934;
		double t=567.89;
		float y=349.1f;
		System.out.println("round of: "+x+ "is :" +Math.round(x));
		System.out.println("round off: "+y+"is :"+Math.round(y));
		
		//double pi=Double.POSITIVE_INFINITY;
		//System.out.println("possitive infinity:"+Math.round(pi));
		
		double pi=Double.NEGATIVE_INFINITY;
		System.out.println("NEGATIVE INFINITY: "+Math.round(pi));
		
		//double pi=Double.NaN;
		//System.out.println("NaN "+Math.round(pi));
		
		// negative, nan
		
		double d=Math.round(2.5+Math.random());
		System.out.println("value "+d);
	}

}
