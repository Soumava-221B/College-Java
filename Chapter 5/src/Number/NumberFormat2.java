																	//   21-11-20
package Number;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormat2 {
	public static final double data[] = {
			0, 1, 22d/7, 100.2345678
			};

	public static void main(String[] args) {
		NumberFormat form = NumberFormat.getInstance();
		form.setMinimumIntegerDigits(3);
		form.setMinimumFractionDigits(2);
		form.setMaximumFractionDigits(4);
		for (int i=0; i<data.length; i++)
			System.out.println(data[i] + "\tformats as " +form.format(data[i]));
		
		System.out.println("");
		
		NumberFormat defForm = NumberFormat.getInstance();
		NumberFormat ourForm = new DecimalFormat("##0.##");
		System.out.println("defForm's pattern is " +
				((DecimalFormat)defForm).toPattern());
				System.out.println(intlNumber + " formats as " +
				defForm.format(intlNumber));
				System.out.println(ourNumber + " formats as " +
				ourForm.format(ourNumber));
				System.out.println(ourNumber + " formats as " +
				defForm.format(ourNumber) + " using the default format");
		
	}
	public static final double intlNumber = 1024.25;
	public static final double ourNumber = 100.2345678;
	
	
}
