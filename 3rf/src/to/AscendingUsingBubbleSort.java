package to;

public class AscendingUsingBubbleSort {

	public static void main(String[] args) {
		
		 String a []= {"I" , "admire" , "what" , "kind" , "person"};
			String temp;
			for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a.length-1;j++)
			{
			 if(a[j].compareTo(a[j+1])>0)
			{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
			}
			}  
			System.out.println("Asecnding order of String:");
				for(int i=0;i<a.length;i++)
				
				
				{ System.out.println(a[i]+" ");
				}   
			

		

	}

}
