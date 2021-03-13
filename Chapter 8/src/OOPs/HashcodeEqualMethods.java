package OOPs;

class Employee{
	public int id;
	public String name;
	public Employee (int id, String name)
	{
		this.name=name;
		this.id=id;
	}
	public boolean equals(Object obj)
	{
		if(obj==null)return false;
		if(!(obj instanceof Employee))
			return false;
		if(obj==this)
			return true;
		Employee e=(Employee)obj;
		return e.id==this.id&&e.name==this.name;
	}
	public int hashcode()
	{
		return this.id;
	}
}

public class HashcodeEqualMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Ram");
		Employee e2=new Employee(1,"Sam");
		System.out.println("e1 hashcode="+e1.hashCode());
		System.out.println("e2 hashcode="+e2.hashCode());
		System.out.println("check the equality of e1 and e2"+e1.equals(e2));

	}

}
