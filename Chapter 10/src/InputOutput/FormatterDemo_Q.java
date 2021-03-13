package InputOutput;

import java.util.Formatter;

public class FormatterDemo_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter f=new Formatter();
		Object r=f.format("%1$09d-:the year of %2$f", 1956,Math.PI);
		System.out.println(r);
		
		Object s=String.format("%07d-:the yaer of %f", 1945,Math.PI);
		System.out.println(s);

	}

}
