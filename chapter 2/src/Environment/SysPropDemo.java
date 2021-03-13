package Environment;

public class SysPropDemo {

	public static void main(String[] argv) {
		if (argv.length==0)
			System.getProperties().list(System.out);
		else
		{
			for(String s:argv)
			{
				System.out.println(s+"="+System.getProperty(s));
			}
		}

	}

}
