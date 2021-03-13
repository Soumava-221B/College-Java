package to;

public class DELETECharAT {

	public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Greetings Section-R"); 
        System.out.println("Before removal String = "+ str.toString()); 
        StringBuilder afterRemoval = str.deleteCharAt(10); 
        System.out.println("After removal of character"+ " at index 10 = "+ afterRemoval.toString()); 

	}

}
