package L34_OOPS;

public class Person {

	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {

		try {
			if (age < 0) {
				throw new Exception("Age can't be negative");
			}
			this.age = age;

		} catch (Exception e) {
			System.out.println("in catch");
		}

	}

}
