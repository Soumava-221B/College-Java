package to;

public class ReverseWord {

	public static void main(String[] args) {
	String str="Hello Guys Enjoy";
	String a[]=str.split(" ");
	System.out.println("Before Reversing the String Word:");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	 System.out.println("After Reversing the String Word:");
	 for(int i=a.length-1;i>=0;i--)           // Reverse the string using for loop
	 {
		 System.out.println(a[i]+"");
	 }

	}

}
