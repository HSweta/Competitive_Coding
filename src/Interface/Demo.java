package Interface;

import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arri = { 10, 20, 30, 40, 50 };
		display(arri);

		String[] arrs = { "hello", "India", "Delhi", "CB" };
		display(arrs);

		Car[] cars = new Car[5];
		cars[0] = new Car(1000, 100, "Red");
		cars[1] = new Car(2000, 200, "Yellow");
		cars[2] = new Car(3000, 900, "Black");
		cars[3] = new Car(4000, 30, "Green");
		cars[4] = new Car(5000, 60, "Violet");

		// bubbleSort(cars);
		bubbleSort(cars,new CarSpeedComparator());
		display(cars);
		
		bubbleSort(cars,new CarPriceComparator());
		display(cars);
		
		bubbleSort(cars,new CarColorComparator());
		display(cars);
		

	}

//	public static void display(Integer[] arr) {
//
//		for (Integer val : arr) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
//	}
//
//	public static void display(String[] arr) {
//
//		for (String val : arr) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
//	}

	public static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();
	}

	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (comparator.compare(arr[j], arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
	}

}
