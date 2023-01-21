package oop;

public class Machine {
	
	
	private String name ; 
	private int code ; 
	
	public Machine () {
		
		
		System.out.println("Constructor running ! ");
	}
	
	public Machine(String name ) {
		
		System.out.println("Name");
		
	}
	
	
	public Machine (String Name , int Code ) {
		
		System.out.println("The  3rd constructor is running "  +Name+ "" +Code);
		this.name = Name ; 
		this.code = Code ;    // in order to assign in code 
	}

}
