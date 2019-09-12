package v36_37;

import java.util.ArrayList;
import java.util.Scanner;

public class Upp1 {

	public static void main(String[] args) {
		// Skapa en metod som tar in ett okänt antal heltal och returnerar deras summa.
		ArrayList<Integer> inList = new ArrayList<Integer>();
		inList.add(1);
		inList.add(1);
		inList.add(80);
		Integer summa = summa(inList);
		System.out.println(summa);
	}

	static int summa(ArrayList<Integer> valueList) {
		Integer summa = 0;
		for (Integer tal : valueList) {
			summa += tal;
		}
		return summa;
	}
}