package Number;  															// 21-11-20

public class ConversionBODH_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i:new int[] {2,8,10,16,32});
		{
			int number=42;
			System.out.println(number+"formation in base"+number+"is"+Integer.toString(number, number));
		}
		
		int cv=56;
		System.out.println("other format");
		String str1=Integer.toString(cv,2);
		String str2=Integer.toString(cv,8);
		String str3=Integer.toString(cv,10);
		String str4=Integer.toString(cv,16);
		
		System.out.println(cv+"==base2 "+str1+"  base 8  "+str2+"  base 10  "+str3+"  base 16  "+str4);
		
		System.out.println("integer number"+cv);
		System.out.println("octal number:"+Integer.toOctalString(cv));
		System.out.println("hex number: "+Integer.toHexString(cv));
		System.out.println("binary number: "+Integer.toBinaryString(cv));

	}

}
