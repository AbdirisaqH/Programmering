package v36_37;
import java.util.ArrayList;
public class Upp2 {
	public static void main(String[] args) {
		//  Skapa en rekursiv metod som tar in en sträng och returnerar den baklänges.

		String ord = "az";
		ArrayList<String> list = new ArrayList<String>();
		String resultat = recur(ord, ord.length() - 1, list);
		System.out.println(resultat);
	}
		public static String recur(String ord, int index, ArrayList<String> letters) {
			String result="";
			letters.add(String.valueOf(ord.charAt(index)));
			
			if(index != 0) {
				recur(ord, --index, letters);
			}
			result = letters.toString();
			return result;
		}
	}