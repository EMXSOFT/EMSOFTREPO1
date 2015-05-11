package Test.Encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Room r = new Room();
		r.space=100;		
		School s = new School(r);
		s.teach();

	}

}
