package OOPs;

public class Singleton_R {
	private static Singleton_R s_i=null;
	public String str;
	private Singleton_R()
	{
		str="m using singleton example";
	}
	public static Singleton_R getInstance()
	{
		if(s_i==null)
			s_i=new Singleton_R();
		return s_i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton_R obj= Singleton_R.getInstance();
		Singleton_R obj1=Singleton_R.getInstance();
		obj.str=(obj.str).toUpperCase();  
		System.out.println(obj.str);
		System.out.println(obj1.str);

	}

}
