package courses;

import java.io.File;
import java.io.FileReader;

public class Filenotfounddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:// file.txt") ; 
		//FileReader fr = new FileReader(file) ; 
		Filenotfounddemo demo = new Filenotfounddemo() ;
		demo.testarray() ;
		
		

	}
	
	public void testarray() {
	try {int num[] = {1 , 2 , 3 , 4} ; 
	
	System.out.println(num[6]);
		
	} catch (ArrayIndexOutOfBoundsException  e) {
		System.out.println("Exception throw  :"+e);
	}	
		
	System.out.println("Out of the block , plz try another number ");
	
	}

}


