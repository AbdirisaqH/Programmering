package GT;

import java.util.Random;
import java.util.Scanner;

public class Gissa {

	public static void main(String[] args) {
		System.out.println("Gissa tal mellan 0-10: ");
		System.out.println("Talet är: " + gissa());
	}
	/**
	 * Gissa är en metod som låter en användare gissa talet som datan har och ger
	 * ledtrådar om gissningen är för hög eller för låg, den ger också tillbaka
	 * svaret om du gissar rätt.
	 * 
	 * @return gissning
	 */
	static int gissa() {
		
		// Gör så att programmet väljer ett random tal mellan 0-10
		Random slump = new Random();
		int ANTAL_TAL = slump.nextInt(10);

		
		int gissningar = 0;
		Scanner input = new Scanner(System.in);
		int gissning = 0;

		// Medan man fortfarande gissar ska koden nedan köras
		boolean vinna = false;
		
		while (vinna == false) {

			// Koden gör så att du kan skriva in gissningar flera gånger
			gissning = input.nextInt();
			gissningar++;

			// Om man gissar de random tal datan har rätt så vinner man
			if (ANTAL_TAL == gissning) {
				vinna = true;
			}

			// Följande koden ger ledtrådar om gissningen är för hög eller för låg
			else if (gissning < ANTAL_TAL) {
				System.out.println("TOO LOW");
			}

			else if (gissning > ANTAL_TAL) {
				System.out.println("TOO HIGH");
			}

		}
		return gissning;
	}

}
