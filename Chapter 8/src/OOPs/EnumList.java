package OOPs;

public class EnumList {
	
	enum Stae {
		ON, OFF, UNKNOWN
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Stae i: Stae.values())
		{
			System.out.println(i);
		}
		

	}

}
