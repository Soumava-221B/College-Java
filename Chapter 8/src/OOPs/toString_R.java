package OOPs;

public class toString_R {
	int rollno;
	String name;
	String Department;
	
	toString_R(int rollno,String name,String Department)
	{
		this.rollno=rollno;
		this.name=name;
		this.Department=Department;
	}
	public String toString()    //overriding the string method
	{
		return rollno+" "+name+" "+Department;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toString_R s1=new toString_R(1,"Soumava","West Bengal");
		toString_R s2=new toString_R(2,"Avipsa","Odisha");
		System.out.println(s1);
		System.out.println(s2);

	}

}
