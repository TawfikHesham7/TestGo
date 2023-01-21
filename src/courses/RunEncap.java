package courses;

public class RunEncap {

	public static void main(String[] args) {

		Encaptest    encap =  new Encaptest()  ; 

		encap.setIDnum("123545");
		encap.setAge(35) ; 
		encap.setName("Mohamed Ahmed");

		System.out.println("the ID num is "+encap.getIDnum() +"Age is "+encap.getAge() +"The name is"+encap.getName());




	}

}
