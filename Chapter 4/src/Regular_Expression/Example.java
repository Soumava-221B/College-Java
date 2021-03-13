package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		//1st way
		Pattern pt = Pattern.compile("..s");// . (dot)represents single character
		Matcher m= pt.matcher("abss");
		boolean b1 = m.matches();
		System.out.println("Pattern regex:"+b1);
		
		//2nd way
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println("Pattern regex 2nd way:"+b2);
		
		//3rd way
		boolean b3 = Pattern.matches(".s","as");
		System.out.println("Patern regex 3rd way:"+b3);
		
		//use pattern matches
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "mk"));
		System.out.println(Pattern.matches(".s", "mst"));
		System.out.println(Pattern.matches(".s", "amms"));
		System.out.println(Pattern.matches(".s", "mas"));
		
		System.out.println("Bracket [amn;]");
		System.out.println(Pattern.matches("[amn]", "a"));
		
		System.out.println("? quantifir occurence aonce .or not at all...");
		System.out.println(Pattern.matches("[ass]?", "s"));
		System.out.println(Pattern.matches("[aamn]?", "aaamm"));
		
		System.out.println("+quantifier....");
		System.out.println(Pattern.matches("[ass]+", "a"));
		System.out.println(Pattern.matches("[amn]+", "aaamm"));
		System.out.println(Pattern.matches("[amn]+", "aazzta"));
		
		System.out.println("* quntifier....");
		System.out.println(Pattern.matches("[amn]*", "ammmna"));
		
		System.out.println("metacharacters d....");
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "4443"));
		
		System.out.println("metacharacters D....");
		System.out.println(Pattern.matches("\\d", "m"));
		
		System.out.println("metacharacters D with quantifier...");
		System.out.println(Pattern.matches("\\D*", "mak"));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "chukh16"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "arun$201"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));
		
		System.out.println(Pattern.matches("[^amn]", "c"));
		System.out.println(Pattern.matches("[a-ds-u]", "h"));

	}

}
