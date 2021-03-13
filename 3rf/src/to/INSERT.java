package to;

public class INSERT {

	public static void main(String[] args) {
		 StringBuilder str = new StringBuilder("Greeting Section-R");
	      System.out.println("string = " + str);
	      str.insert(8, 's');
	      System.out.print("After insertion = ");
	      System.out.println(str.toString());

	}

}
