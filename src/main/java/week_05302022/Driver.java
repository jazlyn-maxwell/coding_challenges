package week_05302022;

import static week_05302022.SetOperations.canPartition;
import static week_05302022.SetOperations.reorderDigits;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Running reorderDigits()");
		int arr1[] = {515, 341, 98, 44, 211};
		int arr2[] = {63251, 78221};
		int arr3[] = {1, 2, 3, 4};                                                                               
		System.out.format("reorderDigits(%s, \"asc\") -> %s\n", Arrays.toString(arr1), Arrays.toString(reorderDigits(arr1, "asc")));                                                                               
		System.out.format("reorderDigits(%s, \"desc\") -> %s\n", Arrays.toString(arr1), Arrays.toString(reorderDigits(arr1, "desc")));                                                                               
		System.out.format("reorderDigits(%s, \"asc\") -> %s\n", Arrays.toString(arr2), Arrays.toString(reorderDigits(arr2, "asc")));                                                                               
		System.out.format("reorderDigits(%s, \"desc\") -> %s\n", Arrays.toString(arr2), Arrays.toString(reorderDigits(arr2, "desc")));                                                                               
		System.out.format("reorderDigits(%s, \"asc\") -> %s\n", Arrays.toString(arr3), Arrays.toString(reorderDigits(arr3, "asc")));                                                                               
		System.out.format("reorderDigits(%s, \"desc\") -> %s\n", Arrays.toString(arr3), Arrays.toString(reorderDigits(arr3, "desc")));
		
		System.out.println("\nRunning canPartition()");
		int arr4[] = {2, 8, 4, 1};                                                                   
		int arr5[] = {-1, -10, 1, -2, 20};
		int arr6[] = {-1, -20, 5, -1, -2, 2};            
		System.out.format("canPartition(%s) -> %s\n", Arrays.toString(arr4), canPartition(arr4));            
		System.out.format("canPartition(%s) -> %s\n", Arrays.toString(arr5), canPartition(arr5));            
		System.out.format("canPartition(%s) -> %s\n", Arrays.toString(arr6), canPartition(arr6));
	}
}
