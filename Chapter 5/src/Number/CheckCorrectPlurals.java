																							// 23-11-20
package Number;

public class CheckCorrectPlurals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int n=9
		//int n=0;
		int n=1;
		System.out.println("I read "+n+" BOOK"+(n==1? "..": "S."));
		
		report(0);
		report(1);
		report(2);
		
		//3rd way
		if(n==1)
			System.out.println("We used"+n+"BOOK");
		else
			System.out.println("We use "+n+"BOOKS");
	}
	public static void report (int n)
	{
		System.out.println("we used "+n+" Book "+(n==1? "PPAP":"S"));
	}

}
