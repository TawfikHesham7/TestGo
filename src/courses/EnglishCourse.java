package courses;

public class EnglishCourse {
	// Variables 
	int Student ; 
	int weeks ; 
	int days ;

	public static void main(String[] args) {
		 //Object 
		EnglishCourse   Eng101 = new EnglishCourse() ; 
		 int Totaldays ;
         Eng101.Student = 10 ; 
         Eng101.days = 3 ; 
         Eng101.weeks = 4 ; 
         Totaldays = Eng101.weeks * Eng101.days  ; 
         System.out.println("The English 101 course is the total of " + Totaldays + " Days ");
         
         
         
	}

}
