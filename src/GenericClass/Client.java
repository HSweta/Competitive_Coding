package GenericClass;

import Interface.Car;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Pair<String> pair = new Pair<>();
		pair.one = "abc";
		pair.two = "def";
		
		Pair<Integer> pair1 = new Pair<>();
		pair1.one = 10;
		pair1.two = 20;
		
		PairTwo<Integer,String> pair2 = new PairTwo<>();
		pair2.one = 10;
		pair2.two = "xyz";
		
		LinkedListGeneric<Car> list = new LinkedListGeneric<>();
		
		Car[] cars = new Car[5];
		cars[0] = new Car(1000, 100, "Red");
		cars[1] = new Car(2000, 200, "Yellow");
		cars[2] = new Car(3000, 900, "Black");
		cars[3] = new Car(4000, 30, "Green");
		cars[4] = new Car(5000, 60, "Violet");

        list.addLast(cars[0]);
        list.addLast(cars[1]);
        list.addLast(cars[2]);
        list.addLast(cars[3]);
        list.addLast(cars[4]);
        
        list.display();
        
	}

}
