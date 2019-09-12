package v36_37;

import java.util.ArrayList;

public class Upp3 {

	public static void main(String[] args) { 
		Integer[] gg = {1,2};
		GenericMethod(gg);
	}
	private static <T> T[] GenericMethod(T[] t)
	{
		return t;
	}
	
}
