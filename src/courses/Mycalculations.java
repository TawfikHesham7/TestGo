package courses;

public class Mycalculations  extends Calculations 


{

	public  void   multiplication (int fNum , int secNum)
	{
		
		total=  fNum * secNum ; 
		System.out.println(" The product of the multiplied numbers " +total);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mycalculations mycalc = new Mycalculations () ; 
		
		mycalc.addition(5, 6);
		mycalc.Subtraction(10, 5); 
		mycalc.multiplication(10, 5);
		
		
		
		
		
	}

}
