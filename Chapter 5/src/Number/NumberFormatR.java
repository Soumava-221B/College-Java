																									//  20-11-20
package Number;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=1234567.891078;
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println("default reprsentation: "+nf1.format(d));
		nf1.setMaximumFractionDigits(4);
		nf1.setMinimumIntegerDigits(2);
		
		System.out.println("max and min fraction digit: "+nf1.format(d));
		nf1.setMaximumFractionDigits(3);
		nf1.setMinimumIntegerDigits(2);
		
		System.out.println("max and min integer: "+nf1.format(d));
		
		NumberFormat nf= NumberFormat.getInstance(Locale.GERMAN);
		nf.setMaximumFractionDigits(3);
		
		System.out.println("German representaion: "+d+":"+nf.format(d));
		
		// France
		NumberFormat nf2= NumberFormat.getInstance(Locale.FRANCE);
		nf.setMaximumFractionDigits(5);
		
		System.out.println("France representaion: "+d+":"+nf.format(d));
		
		// Australia
		NumberFormat nf3= NumberFormat.getInstance(Locale.CANADA);
		nf.setMaximumFractionDigits(4);
		
		System.out.println("Canada representaion: "+d+":"+nf.format(d));
		
		// Japan
		NumberFormat nf4= NumberFormat.getInstance(Locale.JAPAN);
		nf.setMaximumFractionDigits(6);
		
		System.out.println("Japan representaion: "+d+":"+nf.format(d));
		
		// Italy
		NumberFormat nf5= NumberFormat.getInstance(Locale.ITALY);
		nf.setMaximumFractionDigits(8);
		
		System.out.println("Italy representaion: "+d+":"+nf.format(d));
	}

}
