package l�xa;

import java.util.Scanner;

public class Upp3 {

	public static void main(String[] args) {
		// Skapa en metod int count(String str, char c) Som tar in en String str och en char c 
		// och returnerar hur m�nga g�nger c f�rekommer i str.

		System.out.println("returnerar hur m�nga g�nger c f�rekommer i det du skriver in:");
		Scanner input = new Scanner(System.in);
		System.out.println("Det finns " + count(input.nextLine(), 'c') + " c i det du skrev in");
	}

	static int count(String str, char c) {
		int counter = 0;

		// Loopa igenom alla tecken i en String
		int length = str.length();
		for (int i = 0; i < length; i++) {

			if (str.charAt(i) == c) {
				counter++;
			}
		}

		return counter;
	}
}