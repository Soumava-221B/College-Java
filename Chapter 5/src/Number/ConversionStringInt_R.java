																				// 23-11-20
package Number;

public class ConversionStringInt_R {

	public static void main(String[] args) {
		
		String string1 = "101010";  // 1248 decimal 10
		
		Integer num1=Integer.parseInt(string1, 2);
		Integer num2=Integer.parseInt(string1, 8);
		Integer num3=Integer.parseInt(string1, 16);
		Integer num4=Integer.parseInt(string1, 10);
		
		System.out.println("base2:"+string1+" :"+num1);
		
		System.out.println("base 8: "+string1+" :"+num2 );
		System.out.println("base 8: "+string1+" :"+num3 );
		
		System.out.println("base 10: "+string1+" :"+num4);
		
		int obj=Integer.parseInt(string1, 2);
		System.out.println(obj);

	}

}
