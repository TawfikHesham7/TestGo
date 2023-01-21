package courses;

public class Mamalint  implements IAnimal {


	public void eat() {
		System.out.println(" Mamal eats ");

	}

	public void travel () {

		System.out.println(" Mamal travels ");


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamalint m = new Mamalint() ; 

		m.eat();
		m.travel();



	}

}
