package l�xa;

import java.util.Scanner;

public class Upp2 {

	public static void main(String[] args) {
//Skapa en metod String reverse(Strings str) som tar in en String och returnerar den bakl�nges.

		System.out.println("programmet tar in det du skriver och returnerar det bakl�nges:");
		Scanner input = new Scanner(System.in);
		System.out.println("Svar: " + reverse(input.nextLine()));
	}

	static String reverse(String str) {

		String str2 = new String();

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + (str.charAt(i));
		}

		return str2;

	}

}