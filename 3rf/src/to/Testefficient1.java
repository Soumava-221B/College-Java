package to;

public class Testefficient1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		StringBuffer sb= new StringBuffer("Java");
		for(int i=0;i<10000;i++)
		{
			sb.append("ITER");
		}
		System.out.println("append StringBuffer:"+sb);
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for(int i=0;i<10000;i++)
		{
			sb2.append("ITER");
		}
		System.out.println("Time atken ny StringBuilder:"+(System.currentTimeMillis()-startTime)+"ms");
	}

}
