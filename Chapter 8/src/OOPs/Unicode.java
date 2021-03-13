package OOPs;

public class Unicode {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String str1 = "\u0000";  //lowest value in unicode
		String str2 = "\uFF00"; // highest value in unicode
		byte arr []=str1.getBytes("UTF-8");
		byte brr []=str2.getBytes("UTF-8");
		
		System.out.println("UTF-8 for \\u0000");
		for(byte a: arr) {       // to print byte array use the for loop
			System.out.print(a);
		}
		System.out.println("\nUTF-8 for \\uffff" );
		for(byte b: brr)
		{
			System.out.print(b);
		}

	}

}
