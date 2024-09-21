package codingAssignment2;

public class cat extends animal{
	@Override
	public String toString() {
		return "cat [name=" + name + ", age=" + age + "]";
	}


	public String name;
	public int age;
	
	
	public cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
}
