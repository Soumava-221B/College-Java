package OOPs;

public class BookExample {
	int x,y;
	public BookExample(int anx, int ay)
	{
		x=anx;y=ay;
	}
	
	public String toString()
	{
		return "BookExample["+x+", "+y+"]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BookExample(42,789));

	}

}
