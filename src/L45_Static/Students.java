package L45_Static;

public class Students {

	String name;
	int rollNo;
	static int totalStudents;

	public Students(String name) {
		this.name = name;

		totalStudents++;
		this.rollNo = totalStudents;
	}

	// non static : non static variable access ? Yes
	// non static : static variable access ? Yes
	// non static fxn : non static fxn call ? Yes
	// non static fxn : static fxn call ? Yes
	
	
	public void introduceYourself() {
		System.out.println(name + " has roll no " + rollNo);
	}

	// static fxn : non static variable access ? NO
	// static fxn : static variable access ? Yes
	// static fxn : non static fxn call ? No
	// static fxn : static fxn call ? Yes

	public static void getNoStudents() {
		System.out.println("Total no of Student " + totalStudents);
	}

}
