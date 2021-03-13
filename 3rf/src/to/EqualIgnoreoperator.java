package to;

public class EqualIgnoreoperator {

	public static void main(String[] args) {
		
		String str1=new String("HELLO");
		
		String str2=new String("Hello");
		String str3=new String("ITER");
		String str4=new String("CSE");
		
		String str5=new String("CsE");
		String str6=new String("CsE");
		
		System.out.println("str5 and str6:"+str5.equals(str6));  //true
		System.out.println("str1 equal to str2:"+str1.equals(str2));//false
		System.out.println("str2 equal to str5:"+str4.equalsIgnoreCase(str5));  //true
		
		System.out.println("str1 and str2 are =="+str1==str2);  // == operator address are compared so it is false
		System.out.println("str1 and str5 are =="+str1==str5);	
		System.out.println('a'=='b');
		System.out.println(20==20);  //integer type
		System.out.println(true==true);  //boolean type
	}

}
