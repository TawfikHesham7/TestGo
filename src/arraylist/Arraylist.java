package arraylist;
import java.util.ArrayList; 

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String > arrlist = new ArrayList<String> ();

		arrlist.add("Ahmed") ; 
		arrlist.add("Mohamed") ; 
		arrlist.add("Mostafa") ; 
		arrlist.add("Mona") ; 
		arrlist.add("Mahmoud") ; 

		System.out.println("Currently the array list "+ arrlist);

		arrlist.add(0, "Mazen");
		System.out.println("Updated the array list "+ arrlist);

		arrlist.remove("Mona") ; 

		System.out.println("Updated the array list  with deleting "+ arrlist);
	}

}
