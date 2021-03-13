package OOPs;

public class AbstractClass_R {

	public static void main(String[] args) {
		Phone1Features2018 obj=new Phone3Features2020();
		//Phone1Features2018 obj=new Phone2Features2019();  // declare it as class
		obj.call();
		obj.music();
		obj.youtube();
		obj.gmail();
		
	}

}
abstract class Phone1Features2018
{
    public void call()
    {
    	System.out.println("Calling....");
    }
    public abstract void music();
    public abstract void youtube();
    public abstract void gmail();
    
}
abstract class Phone2Features2019 extends Phone1Features2018
{
	public void music()
	{
		System.out.println("Playing Music.....");
	}
	
}
class Phone3Features2020 extends Phone2Features2019
{
   public void yoytube()
   {
	   System.out.println("Playing Youtube in Phone 3....");
   }
   public void gmail()
   {
	   System.out.println("it include gmail too in 2020");
   }
@Override
public void youtube() {
	// TODO Auto-generated method stub
	
}
}
