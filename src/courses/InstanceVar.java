package courses;

public class InstanceVar {

	 
	int age = 18 ; 
	
	public void testinstancevar()
	{
		
		System.out.println("Most people graduate from school at age " +age +"Years old "); 
		
	}
	
	
	
	public void testinstancevaragain()
	{ int age = 4 ; 
		
		System.out.println("Most people graduate from school at age " +age +"Years old "); 

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVar instObj  =  new   InstanceVar() ; 
		instObj.testinstancevar(); 
		instObj.testinstancevaragain(); 
		
		

	}

}
