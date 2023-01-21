package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator; 

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> numbers = new ArrayList <Integer> ();

		numbers.add(10) ; 
		numbers.add(20) ; 
		numbers.add(30) ; 
		numbers.add(40) ; 
		numbers.add(100) ; 
		numbers.add(10) ; 
		//System.out.println("Currently the numbers list "+ numbers);
		//System.out.println(numbers.get(2));

		for (int i = 0; i < numbers .size(); i++) {
			System.out.println(numbers.get(i)) ; 

		}
		numbers.remove(numbers.size()-1) ;  // removing last index 

	}

}
