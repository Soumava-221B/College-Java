/*
 * Write a Java program to get the name of the first and last day of a month.
 */
package Assingment;

import java.util.Calendar;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a calendar object 
        Calendar c = Calendar.getInstance();
      System.out.println("The Todays Date is:" + c.getTime()); 
//getting maximum number of days in Month on variable x
      int x= c.getActualMaximum(Calendar.DAY_OF_MONTH);
//getting current date on variable z
      int z=c.get(Calendar.DATE);
//putting condition
      if(z!=1){
//holding current_day-1 on vaiable y
        int y =z-1;
//subtracting (current_day)-(current_day-1) that gives first_day
   c.add(Calendar.DATE,-y); 
//printing first day
        System.out.println("First day of month is: "+ c.getTime());
    }
   else{//printing first day
   System.out.println("First day of month is:" + c.getTime());
   } 
// adding max_day-1 to current_day that gives us last day
    c.add(Calendar.DATE,x-1); 
//printing last day
       System.out.println("Last day of month is: "+ c.getTime());

	}

}
