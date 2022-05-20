package week_05162022;

import java.util.LinkedList;

class SumList {
	
	public static LinkedList<Integer> convertNumToList(int num) {
		LinkedList<Integer> list = new LinkedList<>();
		while (num > 0) {
			list.add(num % 10);
			num = num / 10;
		}
		return list;
	}
	
	public static int convertListToNum(LinkedList<Integer> list) {
		int num = 0;
		while (!list.isEmpty()) {
			num *= 10;
			num += list.pollLast();
		}
		return num;
	}
	
	public static LinkedList<Integer> add(LinkedList<Integer> listX, LinkedList<Integer> listY) {
		LinkedList<Integer> sumList = convertNumToList(convertListToNum(listX) + convertListToNum(listY));
		return sumList;
	}
}