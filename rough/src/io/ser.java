package io;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ser {
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  

	public static void main(String[] args) throws IOException 
	{
		int number,temp;
		ServerSocket s1 = new ServerSocket(1342);
		Socket ss = s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		number = sc.nextInt();
		String name = sc.next();
		
		//temp = number*2;
		String io=name;
		
		PrintStream p = new PrintStream(ss.getOutputStream());
		//p.println(temp);
		p.println();

	}

}
