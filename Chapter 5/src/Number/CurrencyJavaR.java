																											// 21-11-20
package Number;

import java.util.Currency;
import java.util.Locale;

public class CurrencyJavaR {

	public static void main(String[] args) {
		// use of getInstance()
		
		Currency c1=Currency.getInstance("AUD");
		Currency c2=Currency.getInstance("JPY");
		Currency c3=Currency.getInstance(Locale.ITALY);
		Currency c4=Currency.getInstance(Locale.GERMANY);
		Currency c5=Currency.getInstance(Locale.KOREA);
		Currency c6=Currency.getInstance("INR");
		
		// use getCurrencyCode()
		String cc1=c1.getCurrencyCode();
		String cc2=c2.getCurrencyCode();
		String cc3=c3.getCurrencyCode();
		String cc4=c4.getCurrencyCode();
		String cc5=c5.getCurrencyCode();
		String cc6=c6.getCurrencyCode();
		
		System.out.println("Australian dollar code "+cc1);
		System.out.println("Japan Yan code: "+cc2);
		System.out.println("Italy Lira code: "+cc3);
		System.out.println("Germany Euro code: "+cc4);
		System.out.println("Korean Won code: "+cc5);
		System.out.println("Indian Rupee code: "+cc6);
		
		// getSymbol()
		System.out.println("AUD: "+c1.getSymbol());
		System.out.println("JAPAN: "+c2.getSymbol());
		System.out.println("ITALY: "+c3.getSymbol());
		System.out.println("GERMANY: "+c4.getSymbol());
		System.out.println("KOREAN: "+c5.getSymbol());
		System.out.println("INDIA: "+c6.getSymbol());
		
		double x1 = 6.1; double y2 = 4.5; double z = Math.max( x1, y2 ); System.out.print(z);
		
		
		

	}

}
