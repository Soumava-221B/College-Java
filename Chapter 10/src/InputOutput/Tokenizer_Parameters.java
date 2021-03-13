package InputOutput;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Tokenizer_Parameters {
	
	private static final int QUOTE_CHARACTER = 0;
	private static final int DOUBLE_QUOTE_CHARACTER = 0;

	public static void main(String[] args) throws IOException{
	
		StreamTokenizer st = new StreamTokenizer(new StringReader(" ! @ i have 20 Rs; in; my pocket and Ram has 0.01 rs"));
		
		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			
			if(st.ttype == StreamTokenizer.TT_WORD)
			{
				System.out.println("words: "+st.sval);
			}
			else if (st.ttype == StreamTokenizer.TT_NUMBER)
			{
				System.out.println("number: "+st.nval);
			}
			else if(st.ttype == StreamTokenizer.TT_EOL)
			{
				System.out.println();
			}
		}
		//st.cl();

	}

}
