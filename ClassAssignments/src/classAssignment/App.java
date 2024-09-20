package classAssignment;

public class App {

	public static void main(String[] args) {

		
		educatedPerson ep=new educatedPerson("amit",23,"English");
		System.out.println(ep.getName());
		System.out.println(ep.getAge());
		System.out.println(ep.getLanguage());
		ep.read();
		ep.write();
		ep.speak();
		ep.tech();
		ep.walk();
		System.out.println();
		
		Professor p = new Professor();
		p.read();
		p.write();
		p.speak();
		p.tech();
		p.walk();

	}

}
