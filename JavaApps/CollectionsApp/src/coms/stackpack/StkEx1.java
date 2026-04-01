package coms.stackpack;

import java.util.Stack;

public class StkEx1 {
	//Stack : First In - Last Out
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>  stkInt = new Stack<Integer>();
		stkInt.push(101);
		stkInt.push(102);
		stkInt.push(103);
		stkInt.push(104);
		stkInt.push(105);
		
		System.out.println("Stack Values\n" + stkInt);
		System.out.println("Last Value : " + stkInt.peek());
		
		System.out.println("Deleted Value : " + stkInt.pop());
		
		System.out.println("Stack Values After Delete\n" + stkInt);
		
		System.out.println("Last Value : " + stkInt.peek());		
	}
}
