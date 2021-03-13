package OOPs;


class Parent_R //superclass
{
     public void show()
     {
    	 System.out.println("i am in parent class");
     }
}
class Child_R extends Parent_R//subclass
{
	@Override
    public void show()
    {
    	System.out.println("i am in child class");
    }
}

public class Override_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_R obj=new Child_R();
		obj.show();
		Parent_R obj1=new Parent_R();
		obj1.show();

	}

}
