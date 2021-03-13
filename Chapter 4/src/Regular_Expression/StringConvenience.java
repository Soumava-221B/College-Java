package Regular_Expression;

public class StringConvenience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String pattern = ".*Q[^u]\\d+\\..*";
        String line = "Order QT300. Now!";
        
        if(line.matches(pattern)) {
        	System.out.println(line+ "matches \"" + pattern + "\"");
        	
        }
        else {
        	System.out.println("NO MATCH");
        }
	}

}
