package GT;
import java.util.Random;
import java.util.Scanner;
public class Gissa {

	public static void main(String[] args) {
		//inledning
		System.out.println("Gissa tal: ");
		//svar
		System.out.println("Talet är: " + gissa());
	}
	
	/**
	 * Gissa är en metod som låter en användare gissa talet som datan har och
	 * ger ledtrådar om gissningen är för hög eller för låg, 
	 * den ger också tillbaka svaret om du gissar rätt.
	 * @return gissning
	 */
	static int gissa() {
		// Skapar random object
		Random slump = new Random();
		// Gör så att programmet tar upp ett random tal mellan 0-10
		int ANTAL_TAL = slump.nextInt(10);
		// Sätta upp att man kan gissa flera gånger
		int gissningar = 0;
		// Sätta upp att man kan gissa
		Scanner input = new Scanner(System.in);
		int gissning = 0;
		// Gör så att man vinner inte direkt
		boolean vinna = false;
		// Medan man har inte vunnit ska detta programmet köras
		while(vinna == false) {
			// Gör så att man kan skriva in en gissning
			gissning = input.nextInt();
			// Gör så att man kan gissa flera gånger
			gissningar++;
			// Om man gissar de random tal datan har rätt så vinner man
			if(ANTAL_TAL == gissning) {
				vinna = true;
			}
			// Om man gissar på ett mindre tal än det random tal datan har
			else if(gissning < ANTAL_TAL) {
				System.out.println("TOO LOW");
			}
			// Om man gissar på ett högre tal än det random tal datan har
			else if(gissning > ANTAL_TAL) {
				System.out.println("TOO HIGH");
			}
			
		}
		// skickar programmet
		return gissning;
	}

}