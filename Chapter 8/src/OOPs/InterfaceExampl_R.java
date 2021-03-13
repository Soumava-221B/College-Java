package OOPs;

interface Laptop
{
  public void worldfile();
  public void pdf_file();
}
class HPlaptop implements Laptop
{
  public void wordfile()
  {
	  System.out.println("working on wordfile");
  }
  public void pdf_file()
  {
	  System.out.println("pdfile");
  }
@Override
public void worldfile() {
	// TODO Auto-generated method stub
	
}
}

public class InterfaceExampl_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HPlaptop obj=new HPlaptop();
		obj.wordfile();
		obj.pdf_file();

	}

}
