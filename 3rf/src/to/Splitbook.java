package to;
import java.util.StringTokenizer;
public class Splitbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder();
		
		for(String word:"SAMPLE_STRING".split("_"))
		{
			if (sb1.length()>0)		
			{
				sb1.append(", iter-");
			}	
			sb1.append(word);
		}
		System.out.println(sb1);
		// Method using a StringTokenizer
        StringTokenizer st = new StringTokenizer("SAMPLE_STRING");
        StringBuilder sb2 = new StringBuilder();
        
        while(st.hasMoreElements())
        {
        	sb2.append(st.nextToken());
        	if(st.hasMoreElements())
        	{
        		//sb2.append("+");
        	}
        }
        System.out.println(sb2);
	}

}
