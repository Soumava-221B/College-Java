 package Regular_Expression;

 import java.util.regex.Pattern;
 
public class NLMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "I dream of engines\nmore engines, all day long";
		System.out.println("INPUT: "+input);
		
		System.out.println();
		String patt[] = {"engines.more engines", "lines\nmore", "enginess"};
		
		for(int i=0;i<patt.length;i++) {
			System.out.println("PATTERN print: "+patt[i]);
			
			boolean found;
			Pattern pll = Pattern.compile(patt[i]);
			found = pll.matcher(input).find();		
		
			System.out.println("DEFAULT match: "+found);
			
			Pattern pml = Pattern.compile(patt[i], Pattern.DOTALL|Pattern.MULTILINE);
			found = pml.matcher(input).find();
			System.out.println("Multiline match: "+found);
			System.out.println();
		}

	}

}
