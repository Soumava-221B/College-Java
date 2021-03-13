package Structure;

import java.util.Calendar;

public class Array_R_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int monthlen1[];
		monthlen1=new int[12];
		int[]  monthlen2=new int[12];
		int monthlen3[] = {31,2831,30,31,30,31,31,30,31,30,31};
		final int MAx=10;
		Calendar days[] =new Calendar[MAx];
		for(int i=0;i<MAx;i++)
		{
			days[i]=Calendar.getInstance();
			System.out.println("out"+days);
		}

	}

}
