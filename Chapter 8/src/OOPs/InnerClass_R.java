package OOPs;

public class InnerClass_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass obj1=new OuterClass();
		obj1.show();
		
		//OuterClass.InnerClass obj2=obj1.new InnerClass();
		//obj2.display();
		//OuterClass.InnerClass obj3=new OuterClass.InnerClass();
		//obj3.display();
		
		//System.out.println("Addition of two numbers from Nested Class Value: "+(obj2.b+obj1.a));

	}

}
class OuterClass
{
   static int a=10;
   public void show()
   {
	   System.out.println("in outer class");
   }
   class InnerClass     //inner class
   {
	   int b=20;
	   public void display()
	   {
		   System.out.println("you are in Inner class");
	   }
   }
}