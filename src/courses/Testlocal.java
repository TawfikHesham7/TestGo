package courses;

public class Testlocal {
	
	
	
	public void testlocalvariable ()
	{
		
		int age = 34 ; 
		System.out.println("How old are you ? " +age);
		
		
		
	}

	public void testsamelocalvariable ()
	{
		
		int age = 38 ;  
		
		System.out.println("How old are you ? " +age);
 
		
	}
	
	public void testparametervariable (int age) {
		
		System.out.println(" Jan Doe is " +age + " years old");
		
				
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testlocal testclass = new Testlocal() ; 
		
		testclass.testlocalvariable() ; 
		testclass.testsamelocalvariable()  ; 
		testclass.testparametervariable(90);
		

	}

}
