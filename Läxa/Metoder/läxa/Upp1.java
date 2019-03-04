package läxa;

import java.util.Scanner;

public class Upp1 {

	public static void main(String[] args) {
//Skapa en metod  som tar in radien på ett klot och ger tillbaka dess volym.

		System.out.println("Skriv in radien på ett klot och programmet ger tillbaka dess volym:");
		Scanner input = new Scanner(System.in);
		System.out.println("Volymen är: " + volume(input.nextDouble()));
	}

	static double volume(double radius) {

		double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;

		return volume;

	}

}