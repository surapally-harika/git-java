package codingAssignment2;

public class dog extends animal{
	public String name;
	public int age;
	
	public dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "dog [name=" + name + ", age=" + age + "]";
	}
	

}
