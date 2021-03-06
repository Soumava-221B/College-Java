package to;

import java.util.Scanner;

public class AllPerNumber {
	private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
    	System.out.println("Enter the string:");
    	String s=input.nextLine();
        int n = s.length(); 
        AllPerNumber permutation = new AllPerNumber(); 
        permutation.permute(s, 0, n-1); 

		
	}

}
