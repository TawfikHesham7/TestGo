package polymorphismdemo;

public class Methodoverloading {

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		Overload obj = new Overload() ; 
		double result ; 

		obj.demo(10);
		obj.demo(10, 20);
		result  = obj.demo(5.50) ; 
		System.out.println("Final result "+ result);




	}

}
