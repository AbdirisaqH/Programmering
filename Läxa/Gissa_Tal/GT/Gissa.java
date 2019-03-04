package GT;
import java.util.Random;
import java.util.Scanner;
public class Gissa {

	public static void main(String[] args) {
		//inledning
		System.out.println("Gissa tal: ");
		//svar
		System.out.println("Talet �r: " + gissa());
	}
	
	/**
	 * Gissa �r en metod som l�ter en anv�ndare gissa talet som datan har och
	 * ger ledtr�dar om gissningen �r f�r h�g eller f�r l�g, 
	 * den ger ocks� tillbaka svaret om du gissar r�tt.
	 * @return gissning
	 */
	static int gissa() {
		// Skapar random object
		Random slump = new Random();
		// G�r s� att programmet tar upp ett random tal mellan 0-10
		int ANTAL_TAL = slump.nextInt(10);
		// S�tta upp att man kan gissa flera g�nger
		int gissningar = 0;
		// S�tta upp att man kan gissa
		Scanner input = new Scanner(System.in);
		int gissning = 0;
		// G�r s� att man vinner inte direkt
		boolean vinna = false;
		// Medan man har inte vunnit ska detta programmet k�ras
		while(vinna == false) {
			// G�r s� att man kan skriva in en gissning
			gissning = input.nextInt();
			// G�r s� att man kan gissa flera g�nger
			gissningar++;
			// Om man gissar de random tal datan har r�tt s� vinner man
			if(ANTAL_TAL == gissning) {
				vinna = true;
			}
			// Om man gissar p� ett mindre tal �n det random tal datan har
			else if(gissning < ANTAL_TAL) {
				System.out.println("TOO LOW");
			}
			// Om man gissar p� ett h�gre tal �n det random tal datan har
			else if(gissning > ANTAL_TAL) {
				System.out.println("TOO HIGH");
			}
			
		}
		// skickar programmet
		return gissning;
	}

}