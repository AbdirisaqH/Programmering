package l�xa;

import java.util.Scanner;

public class Upp4 {

	public static void main(String[] args) {
		// Skapa en metod String sjorovare(String str) som
		// tar in en String och returnerar dess motsvarighet i sj�r�varspr�ket

		System.out.println("Programmet returnerar det du skriver in i dess motsvarighet i sj�r�varspr�ket:");
		Scanner input = new Scanner(System.in);
		System.out.println("Det �r: " + sjorovare(input.nextLine()));
	}

	static String sjorovare(String str) {
		// Skapar array f�r att datan ska veta vad en konsonant och vokal �r
		char[] konsonanter = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
		char[] vokaler = { 'a', 'e', 'i', 'o', 'u', 'y', '�', '�', '�' };
		// Jag skapade "new String" f�r det �r vad jag beh�ver returnera
		String str2 = new String();
		// Jag skapar detta f�r att loopa igenom alla tecken i Stringet
		int length = str.length();
		for (int i = 0; i < length; i++) {
			// Jag gjorde detta s� jag kunde loopa igenom arrayerna
			for (int k = 0; k < vokaler.length; k++) {
				if (str.charAt(i) == vokaler[k])
					// str2 �r tom s� jag beh�ver ge det ett v�rde
					str2 = str2 + (str.charAt(i));
			}
			for (int j = 0; j < konsonanter.length; j++) {
				if (str.charAt(i) == konsonanter[j])
					str2 = str2 + (str.charAt(i) + "o" + str.charAt(i));
			}
		}
		// Jag skickar tillbaka koden
		return str2;
	}
}