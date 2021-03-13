package to;

public class Replace1 {

	public static void main(String[] args) {
		
		String stringVl="REPLACE SPACE words REPLACE";
		 
		//System.out.println("Original String with tabs, spaces and newline: \n"+originalStr);
        String str2="Hello\t\n ITER"; 
        System.out.println(str2);
		System.out.println(stringVl.replace("REPLACE", "COMPRESSION"));
         System.out.println(stringVl.replaceFirst("REPLACE", "COMPRESSION"));
         
         System.out.println("\nString after removing tabs, spaces and new line: "+stringVl);
	}

}
