package l�xa;

import java.util.Scanner;

public class Upp1 {

	public static void main(String[] args) {
//Skapa en metod  som tar in radien p� ett klot och ger tillbaka dess volym.

		System.out.println("Skriv in radien p� ett klot och programmet ger tillbaka dess volym:");
		Scanner input = new Scanner(System.in);
		System.out.println("Volymen �r: " + volume(input.nextDouble()));
	}

	static double volume(double radius) {

		double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;

		return volume;

	}

}