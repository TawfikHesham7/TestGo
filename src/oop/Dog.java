package oop;

public class Dog  extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Dog() ; 
		
		obj.Sound(); 
		obj.Move(); 

	}
	
	
	public void Sound()
	{
		System.out.println("Woof"); 
	}
	
	
	public void Move() {
		System.out.println("Fast");
	}

}
