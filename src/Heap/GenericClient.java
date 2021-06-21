package Heap;

import L61_Generics.Fxn.Car;

public class GenericClient {
	public static void main(String[] args) {

		Car[] cars = new Car[5];
		cars[0] = new Car(100, 5000, "Red");
		cars[1] = new Car(50, 7000, "Yellow");
		cars[2] = new Car(200, 2000, "Black");
		cars[3] = new Car(30, 1000, "Green");
		cars[4] = new Car(150, 3000, "Violet");
		
		GenericHeap<Car> heapg = new GenericHeap<Car>();
		heapg.add(cars[0]);
		heapg.add(cars[1]);
		heapg.add(cars[2]);
		heapg.add(cars[3]);
		heapg.add(cars[4]);
		
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		
	}
}