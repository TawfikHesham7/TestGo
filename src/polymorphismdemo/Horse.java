package polymorphismdemo;

public class Horse extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal  obj = new Horse(); 
		
		obj.sound();
 
	
	
	

	}
	
	
	
	
	@Override

public void sound() {
		
		System.out.println(" Horse is good ");
	}


}