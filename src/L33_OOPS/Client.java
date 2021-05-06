package L33_OOPS;

public class Client {

	public static void main(String[] args) {

		Student s = new Student();

		// get the data
		System.out.println(s.name);
		System.out.println(s.age);

		// update the data
		s.name = "Sweta";
		s.age = 19;

		System.out.println(s.name);
		System.out.println(s.age);

		Student s1 = s; // a new reference is formed
		s1.name = "Honey";

		System.out.println(s.name);

		Student s2 = new Student(); // a new reference and instance is formed
		s2.name = "Samar";
		s2.age = 30;

		System.out.println(s2.name);
		System.out.println(s2.age);

		s1 = s2;

		Student s3 = new Student();
		s3.age = 10;
		s3.name = "A";

		Student s4 = new Student();
		s4.age = 20;
		s4.name = "B";

		Test1(s3, s4);
		System.out.println(s3.age + " " + s3.name);
		System.out.println(s4.age + " " + s4.name);

		Test2(s3, s4);
		System.out.println(s3.age + " " + s3.name);
		System.out.println(s4.age + " " + s4.name);
		
		

	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

	public static void Test2(Student s1, Student s2) {

		int tempa = s1.age;
		s1.age = s2.age;
		s2.age = tempa;

		String tempn = s1.name;
		s1.name = s2.name;
		s2.name = tempn;
	}

	public static void Test3(Student s1, Student s2) {

		s2 = new Student();
		int tempa = s1.age;
		s1.age = s2.age;
		s2.age = tempa;

		String tempn = s1.name;
		s1.name = s2.name;
		s2.name = tempn;
	}

	public static void Test4(Student s1, Student s2) {

		s2 = new Student();
		int tempa = s1.age;
		s1.age = s2.age;
		s2.age = tempa;
        
		s1 = new Student();
		String tempn = s1.name;
		s1.name = s2.name;
		s2.name = tempn;
	}

    public static void Test5(Student s1) {
    	
    }
}
