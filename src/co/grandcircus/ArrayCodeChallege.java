package co.grandcircus;
import java.util.Arrays;

/*
 * Given an array of ints length 3, 
 * figure out which is larger, 
 * the first or last element in the array, 
 * and set all the other elements to be that value. 
 * Return the changed array.
 */

public class ArrayCodeChallege {

	public static void main(String[] args) {

		int[] arr = { 98, 43, 22 };
		int max = getMax(arr);
		Arrays.fill(arr, 0, arr.length, max);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int getMax(int[] arr)  {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				return max =  arr[i];
			}
		}
		return max;
	}

}
