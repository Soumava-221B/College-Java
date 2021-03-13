package Number;


public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="12345.00";
		
		boolean numeric = true;
		try
		{
			Integer num=Integer.parseInt(str1);
		}
		catch (NumberFormatException e)
		{
			numeric= false;
		}
		if(numeric)
		System.out.println(str1+" is a number");
		else
			System.out.println(str1+" is not a nummber");
		
		// Converting String to Integer
		String str2="100";
		int num=2;
		int convert=Integer.parseInt(str2);
		int sum=convert+num;
		System.out.println("Conversion Results: "+sum);
		
		int rr=Integer.valueOf(sum);
		System.out.println("Conversion Results valueOf(): "+sum);
		
		String str3="12345.345";
		double db=Double.parseDouble(str3);
		System.out.println("Double Value Parse: "+db);
		
		double str4=12345.345;
		Double obj=new Double(str4);
		double str5=obj.doubleValue();
		System.out.println(str5);

	}

}
