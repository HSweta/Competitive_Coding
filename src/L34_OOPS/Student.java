package L34_OOPS;

public class Student {
	
	String name="Honey";
	int age = 19;
	
	public Student() {
		this.name = "Sweta";
		this.age = 20;
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduceYourself() {
		System.out.println(name + " is " + age + " years old.");
	}

}
