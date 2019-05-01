package co.grandcircus;
/*********** @Author: Linmei Mills ***********/
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] studentNum = { 1, 2, 3, 4, 5, 6 };
		String[] studentsName = { "Mary", "Adam", "Rohit", "Antonella", "Mariah", "Myself" };
		String[] hometown = { "Earth", "Mars", "the Moon", "Jupiter", "Venus", "Heaven" };
		String[] favoriteFood = { "fruit", "Pizza", "Pad Thai", "Salad", "Pho", "Air" };
		String[] favoriteColor = { "Grey", "Black", "Blue", "Brown", "White", "Red" };

		System.out.println("Welcome to our Java class. ");
		String userContinue = "y";
		do {
			try {
				System.out.println("Which student would you like to learn more about?(Enter a number 1-6):");
				int num = sc.nextInt();
				getStudentInfo(sc, num, studentsName, hometown, favoriteFood, favoriteColor);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("That student does not exist. Try only enter 1-6");
			} catch (IllegalArgumentException e) {
				System.out.println("That is not a number.");
			} catch (Exception e) {
				System.out.println("An unknown error occurred. You might entered something else rather than an integer, please try enter just 1-6.");
			}

			System.out.println("Continue?(y/n): ");
			userContinue = sc.nextLine();
		} while (userContinue.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");

	}

	public static void getStudentInfo(Scanner sc, int num, String[] studentsName, String[] hometown,
			String[] favoriteFood, String[] favoriteColor) {
		while (sc.hasNextLine()) {
			sc.nextLine();
			System.out.println("Student " + num + " is " + studentsName[num - 1] + ","
					+ " What would like to know about " + studentsName[num - 1] + "?"
					+ "(Enter \"hometown\" , \"favorite food\", or \"favorite color\")");
			String userInput = sc.nextLine();
			userInput = userInput.toLowerCase();
			try {
				if (userInput.matches("\\bhometown\\b|\\bfavorite food\\b|\\bfavorite color\\b")) {
					if (userInput.equals("hometown")) {
						System.out.println(studentsName[num - 1] + " is from " + "" + hometown[num - 1] + ".");
						break;
					} else if (userInput.matches("\\bfavorite food\\b")) {
						System.out
								.println(favoriteFood[num - 1] + " is " + studentsName[num - 1] + "'s favorite food.");
						break;
					} else {
						System.out.println(
								favoriteColor[num - 1] + " is " + studentsName[num - 1] + "'s favorite color.");
						break;
					}
				}
				throw new InputMismatchException("Invalid entry.");

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				System.out.println("That data doesn't exist.");
				break;
			}
		}
	}
}
