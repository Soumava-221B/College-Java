package to;

public class TryDel {

	public static void main(String[] args) { 
        StringBuilder str= new StringBuilder("Greetings Section-R"); 
        System.out.println("Before removal String = "+ str.toString()); 
        StringBuilder afterRemoval = str.delete(9, 17); 
        System.out.println("After removal String = "+ afterRemoval.toString()); 

	}

}
