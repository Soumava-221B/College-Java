package OOPs;

public class CallbyValue_R {
	static int a=30;
    void change_data(int a)  
	{
		 this.a=a+10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyValue_R obj=new CallbyValue_R();
		int total;
		System.out.println("before calling a value= "+obj.a);
		obj.change_data(obj.a);
		System.out.println("after caling a= "+obj.a);

	}

}
