package oop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 

public class Filereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File ("Hello.txt") ; 
		try {
			file.createNewFile() ;
			FileWriter  writer = new FileWriter(file) ; 
			writer.write("Hello from created file ");
			writer.flush(); 
			writer.close(); 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
