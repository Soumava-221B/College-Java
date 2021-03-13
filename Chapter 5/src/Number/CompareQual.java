																							// 16-11-20
package Number;

public class CompareQual {

	public static void main(String[] args) {
		double a=(0.3*3)+0.1;
		double b=3;
		if(new Double(a).equals(new Double(b)))
		System.out.println("equal");
		else 
			System.out.println("not equal");
		
		int w1=32;
		int w2 = 90;
		System.out.println("Compare two Integer Numbers "+Integer.compare(w1, w2));
		
		int cmp=Double.compare(a, b);
		if(cmp>0)
		{
			System.out.println("a is greater than b");
		}
		else if(cmp<0)
		{
			System.out.println("a is less b");
		}
		else
		{
			System.out.println("both are equal");
		}
	}

}
