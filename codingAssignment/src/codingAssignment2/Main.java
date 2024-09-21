package codingAssignment2;

public class Main {
	
	public static void main(String[] args) {
		
		cat c = new cat("Tomy", 2);
		System.out.println(c);
		c.eating();
		c.sleeping();
		c.walking();
		
		dog d = new dog("puppy", 4);
		System.out.println(d);
		d.eating();
		d.sleeping();
		d.walking();
		
	}

}
