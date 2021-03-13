package to;

public class PrintIntials {
	
	static void print(String name)
	{
		if(name.length()==0)
			return;
		String w[]=name.split("");
		for(String ws:w)
		{
			System.out.println(Character.toUpperCase(ws.charAt(0))+"");
		}
	}

	public static void main(String[] args) {
	       
  String name = "Soumava Das";
  print(name);

	}

}
