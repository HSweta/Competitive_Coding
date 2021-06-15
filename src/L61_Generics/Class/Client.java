package L61_Generics.Class;

import L61_Generics.Fxn.Car;

public class Client {

	public static void main(String[] args) throws Exception {

		// Pair<String, Float> p = new Pair<>();

		LinkedListGeneric<Car> ll = new LinkedListGeneric<Car>();

		ll.addLast(new Car(100, 5000, "Red"));
		ll.addLast(new Car(50, 7000, "Yellow"));
		ll.addFirst(new Car(200, 2000, "Black"));
		ll.addLast(new Car(30, 1000, "Green"));
		ll.addFirst(new Car(150, 3000, "Violet"));
		ll.display();

	}
}
