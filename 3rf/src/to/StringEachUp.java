package to;
import java.util.Scanner;

public class StringEachUp {
	static String convert(String str) 
    { 
        char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
            if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') {       
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
            else if (ch[i] >= 'A' && ch[i] <= 'Z')          
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
        String st = new String(ch); 
        return st; 
    } 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s1= sc.nextLine();
		System.out.println(convert(s1));

	}

}
