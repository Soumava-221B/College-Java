package to;
import java.util.Scanner;
public class Delimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner("Sam Penn: 14 Bridge St.:Hoboken, NJ 01881");
		sc.useDelimiter(":");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}

	}

}
