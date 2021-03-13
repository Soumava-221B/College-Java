package to;
import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		
		System.out.println(new Random().nextInt(11));
		
		String str[]= {"Anjali","Arpita","Rahul","Soumava","Ankit","Op"};
		
		System.out.println("Randomly selected name:"+str[new Random().nextInt(str.length)]);

	}

}
