package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("Rami");
		names.add("Daniel");
		names.add("Joaquin");
		names.add("YO");
		names.add("WASSUP");
		//3. Print all the Strings using a standard for-loop//ON THIS ONE, HAVENT TESTED THE FOR LOOP YET, SO TEST IT
		for(int i=0; i<names.size(); i++) {
			String s=names.get(i);
			System.out.println("String at index "+i+" is "+s);
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
