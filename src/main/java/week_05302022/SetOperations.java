package week_05302022;

import java.util.Arrays;
import java.util.Collections;

public class SetOperations {

	public static int[] reorderDigits(int[] arr, String order) {
		
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			String temp = Integer.toString(num);
			int digits[] = new int[temp.length()];
			
			// convert int to array of digits
			for (int j = 0; j < digits.length; j++) {
				digits[j] = num % 10;
				num /= 10;
			}
			if (order == "asc") {
				Arrays.sort(digits);
			}
			else if (order == "desc") {
				digits = Arrays.stream(digits)
						.boxed()
						.sorted(Collections.reverseOrder())
						.mapToInt(Integer::intValue)
						.toArray();
			}
			else {
				return null;
			}
			
			// convert array of digits to int
			num = 0;
			for (int j = 0; j < digits.length; j++) {
				num = (num * 10) + digits[j];
			}
			arr[i] = num;
		}
		return arr;
	}
	
	public static boolean canPartition(int[] arr) {
		if (Arrays.stream(arr).filter(n -> n==0).count() > 1) {
			return true;
		}
		else if (Arrays.stream(arr).filter(n -> n==0).count() != 0) {
			return false;
		}
		
		int prod = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == (prod/arr[i])) {
				return true;
			}
		}
		return false;
	}
}
