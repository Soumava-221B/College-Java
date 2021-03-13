																			// 20-11-20
package Number;

public class Round {
	
	/*public static final double THRESHOLD = 0.54;
	public static int round(double d) {
	return (int)Math.floor(d + 1.0 - THRESHOLD);  //THRESHOLD used 
	}
*/
	public static void main(String[] args) {
		
		/*for (double d = 0.1; d<=1.0; d+=0.05) {
			System.out.println("My way: " + d + "-> " + round(d));
			System.out.println("Math way:" + d + "-> " + Math.round(d));
			}
			*/
		//Double i = new Double(257.5); boolean x = i.isNaN(); System.out.println(x);
		//Double i = new Double(257.578); int x = i.intValue(); System.out.println(x);

		//Double obj=489.234; int num1=obj.intValue(); System.out.println("double to integer:"+num1);
		double a = 54.67; 
	    int b = 23; 
	    String str1 = Double.toString(a); 
	    String str2 = Integer.toString(b); 
	    double c= a+b;
	    System.out.println("Sum before round off "+c);
	    System.out.println("Sumation after round off " + Math.round(c));  
	    
	
	}
	
	

}
