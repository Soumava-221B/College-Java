package Number;    													// 21-11-20

import java.text.NumberFormat;

public class NumberForamt2 {
	
	public static final double data[] = { 0, 1, 22d/7, 100.2345678};
	public static void main(String[] args) {
		NumberFormat form = NumberFormat.getInstance();
		form.setMinimumIntegerDigits(3);
		form.setMinimumFractionDigits(2);
		form.setMaximumFractionDigits(4);
		for (int i=0; i<data.length; i++)
		System.out.println("Data Values are: "+data[i] + "\tformats as " +
		form.format(data[i]));

	}

}
