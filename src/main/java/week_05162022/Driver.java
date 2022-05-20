package week_05162022;

import java.util.LinkedList;

public class Driver {

	/**
	 * Run code testing the capabilities of the custom data
	 * structures this week
	 * @param args not used in the current implementation
	 */
	public static void main(String[] args) {
		// Test Sum Lists
		System.out.println("Running Sum Lists");
		int num1 = 617;
		LinkedList<Integer> list1 = SumList.convertNumToList(num1);
		System.out.println("Linked List 1: " + list1);
		int num2 =295;
		LinkedList<Integer> list2 = SumList.convertNumToList(num2);
		System.out.println("Linked List 2: " + list2);
		LinkedList<Integer> sumList = SumList.add(list1, list2);
		System.out.println("Linked List Sum: " + sumList);
		System.out.println("Sum: " + SumList.convertListToNum(sumList));
		
		// Test Stack Min
		System.out.println("Running Stack Min");
		StackMin stack = new StackMin();
		System.out.println("Push 3, 6");
		stack.push(3);
		stack.push(6);
		System.out.println("Min " + stack.min());
		System.out.println("Push 2");
		stack.push(2);
		System.out.println("Min " + stack.min());
		System.out.println("Pop " + stack.pop());
		System.out.println("Min " + stack.min());
	}
}
