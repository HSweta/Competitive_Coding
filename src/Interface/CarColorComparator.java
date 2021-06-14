package Interface;

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car>{

	
	public int compare(Car tcar, Car ocar) {
		
		return tcar.color.compareTo(ocar.color);
	}

}
