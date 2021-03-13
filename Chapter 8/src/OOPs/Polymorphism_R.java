package OOPs;

public class Polymorphism_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildAnimals o=new WildAnimals();
		WildAnimals t=new Tiger();
		WildAnimals s=new Snakes();
		
		o.animalSound();
		t.animalSound();
		s.animalSound();

	}

}
class WildAnimals
{
  	public void animalSound()
  	{
  		System.out.println("the wild animals make sounds");
  	}
}
class Tiger extends WildAnimals
{
   public void animalSound()
   {
	   System.out.println("the Tiger say: Arhg..., Growls"); //#Boss Baby
       System.out.println("The dog says: Bho bho...");
   }
   
}
class Snakes extends WildAnimals
{
   public void animalSound()
   {
	   System.out.println("the snakes says: hhhiiiiisssss......");
   }
}