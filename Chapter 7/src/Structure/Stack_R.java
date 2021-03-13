package Structure;

import java.util.Stack;

public class Stack_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>s=new Stack<>();
		//to check stack is empty or not
		boolean b=s.empty();
		System.out.println("stack is empty: "+b);
		//push element 
		s.push(12);
		s.push(19);
		s.push(100);
		s.push(1);
		System.out.println("element of stack: "+s);
		b=s.empty();
		System.out.println("to check empty stack: "+b);
		//remove elements using pop() method
		System.out.println("poope elements: "+s.pop());
		System.out.println("popped element:"+s.pop());
		System.out.println("stack after pop elements");
		System.out.println(s.peek());

	}

}
