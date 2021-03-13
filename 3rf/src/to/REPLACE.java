package to;

public class REPLACE {

	public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Greetings Section-R"); 
        System.out.println("Before Replace = "+ str.toString()); 
        StringBuilder strReturn = str.replace(3, 12, "e are "); 
        System.out.println("After Replace() String = "+ strReturn.toString()); 

	}

}
