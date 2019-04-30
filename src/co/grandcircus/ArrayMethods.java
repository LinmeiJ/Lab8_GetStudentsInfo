package co.grandcircus;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		double[] prices = {4.44, 3.33, 2.22, 1.99};
		System.out.println(Arrays.toString(prices));
		Arrays.fill(prices, 0, 2, 4.99); //change the price from index 0 to 2 exclusive
		System.out.println(Arrays.toString(prices));
		
		double[] price2 = {4.44, 3.33, 2.22, 1.9};
		//becoz array are reference types we should ever user == to check equality
		//this will return type
		System.out.println(prices == price2);
		String[] students = {"Victoria", "Nick", "Luke", "Finny"};
		
		//be carefull, this is dangerious to copy students to professionals, both variables are pointing to the same memory location
		// changing one will change the other. usually not what you want.
		String[] professionals = students;
		students[0] = "Alayna";
		professionals[2] = "Rohit";
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(professionals));
		//for sovling above situation by using copyOf(arrayName, length);
		//current way to make a copy:
		String[] realPros =Arrays.copyOf(students, 2); 
		System.out.println(Arrays.toString(realPros));
				
		realPros[0] = "Nikki";
		System.out.println("Copyof method: ");
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(realPros));
		
		//*****************Parallel Arrays*********************
		String[] player = {"Nice", "Adam", "Devosha", "Stassi"};
		int[] jerseyNums = {3, 15, 2, 14};
		String[] teamNameStrings = {"Arsenal", "Chelsa", "Cookie Love", "Lit"};
		
		for (int i = 0; i < player.length; i++) {
			System.out.println(jerseyNums[i] + " " + player[i] + " " + teamNameStrings[i]);
		}
		
		int[] jerseyNums2 = {3, 15, 2, 14, 67, 89, 32};
		int jerseySum = sumArray(jerseyNums2);
		System.out.println(jerseySum);
		
		String[] testFoodStrings = getFoodArray("Orange"); //for readability to asign a variable
		System.out.println(Arrays.toString(testFoodStrings));
	}
	
	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		return sum;
	}
	
	public static String[] getFoodArray(String food) {
		String[] foods = { "cookies", "handpies", "buffalo chicken dip", "sliders" };
		foods[3] = food;
		return foods;
	    }
		
	}
