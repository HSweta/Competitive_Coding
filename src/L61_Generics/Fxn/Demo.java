package L61_Generics.Fxn;

import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Integer[] arri = { 10, 20, 30, 40, 50 };
		//display(arri);

		String[] arrs = { "hello", "India", "Delhi", "CB" };
		//display(arrs);

		Car[] cars = new Car[5];
		cars[0] = new Car(100, 5000, "Red");
		cars[1] = new Car(50, 7000, "Yellow");
		cars[2] = new Car(200, 2000, "Black");
		cars[3] = new Car(30, 1000, "Green");
		cars[4] = new Car(150, 3000, "Violet");

//		BubbleSort(cars);
//		display(cars);
		//BubbleSort(cars, new CarSpeedComparator());
		//display(cars);
		BubbleSort(arri,new IntegerComparator());
		display(arri);
	}

	// no comparison required
	public static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> void BubbleSort(T[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

	public static <T> void BubbleSort(T[] arr, Comparator<T> comp) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (comp.compare(arr[i], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
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
//
//	public static  void display(Car[] arr) {
//
//		for (Car val : arr) {
//			System.out.println(val + " ");
//		}
//		System.out.println();
//	}

}
