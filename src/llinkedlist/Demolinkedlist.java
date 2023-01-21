package llinkedlist;

import java.util.LinkedList;

public class Demolinkedlist {

	public static void main(String[] args) {
		// list  Decleration 
		LinkedList<String> linkedlist  = new LinkedList<String>()  ; 


		// Add string elements in the list 

		linkedlist.add("Add item 1 "); 
		linkedlist.add("Add item 5 "); 
		linkedlist.add("Add item 3 "); 
		linkedlist.add("Add item 7 "); 
		linkedlist.add("Add item 8 "); 
		linkedlist.add("Add item 19 "); 
		linkedlist.add("Add item 10 "); 

		System.out.println("Linkedlist content " +linkedlist);

		//***************************************************\

		// Add first & last element 

		linkedlist.addFirst("First item ");  // Editing first element 
		linkedlist.addLast("last item ");     // Editing last element 


		System.out.println("Linkedlist content after adding " +linkedlist);

		// How to set and get values 

		Object firstvar = linkedlist.get(0 ) ; 

		System.out.println("First element : " + firstvar);

		linkedlist.set(0, "Changed first item ") ; 

		String  secondvar  = linkedlist.get(0) ;   //we can make an object also 

		System.out.println("First element after updating by set method is  : " + secondvar);
		/****************************************************************/

		linkedlist.removeLast() ;
		linkedlist.removeFirst() ; 

		System.out.println(" LINKEDLIST AFTER REMOVING "+ linkedlist);

		//***************************************************************

		// Adding from a new position and remove 

		linkedlist.add(1, "Gone");
		System.out.println(" updated  LINKEDLIST  "+ linkedlist);


	}

}
