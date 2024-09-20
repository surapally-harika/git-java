package classAssignment;

public class educatedPerson extends Humanclass {

	public String name;
	public int age;
	public String language;
	
	
	public educatedPerson(String name, int age, String language) {
		super();
		this.name = name;
		this.age = age;
		this.language = language;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public void read() {
		System.out.println("some humans are read the text if they are educated ");
		
	}
	@Override
	public void write() {
		System.out.println("humans are write somethings if they know the education ");
		
	}
	
	@Override
	public void tech() {
		System.out.println("lecturers are teach the subjects ");
		
	}
	
}
