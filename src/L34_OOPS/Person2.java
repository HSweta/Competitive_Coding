package L34_OOPS;

public class Person2 {
	
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		try {
			if (age < 0) {
				throw new RuntimeException("Age can't be negative");
			}
			this.age = age;

		} catch (Exception e) {
			System.out.println("in catch");
		}

	}

}
