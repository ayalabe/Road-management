package Toll;

import java.util.ArrayList;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList<Checkpoints> checkpoints = new LinkedList<Checkpoints>();
		Checkpoints checkpoint1 = new Checkpoints("A", "Jerusalem", 1);
		Checkpoints checkpoint2 = new Checkpoints("B", "Jerusalem", 2);
		Checkpoints checkpoint3 = new Checkpoints("C", "Jerusalem", 3);
		Checkpoints checkpoint4 = new Checkpoints("D", "Jerusalem", 4);
		Checkpoints checkpoint5 = new Checkpoints("E", "Jerusalem", 5);
		Checkpoints checkpoint6 = new Checkpoints("E", "Jerusalem", 6);
		
		checkpoints.add(checkpoint1);
		checkpoints.add(checkpoint2);
		checkpoints.add(checkpoint3);
		checkpoints.add(checkpoint4);
		checkpoints.add(checkpoint5);
		
		Toll toll = new Toll(checkpoints);
		
		ArrayList<Car> cars = new ArrayList();
		
		Car car1 = new Car(100, 123456, toll);
		Car car2 = new Car(200, 123567, toll);
		Car car3 = new Car(300, 123890, toll);
		Car car4 = new Car(400, 123345, toll);
		Car car5 = new Car(500, 123123, toll);
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		
		
		System.out.println(toll);
		toll.removeCheckpoint(2);
		toll.addCheckpoint(3,checkpoint6);
		System.out.println(toll);
		int i = 0;
		while(i != 10) {
			for (Car car : cars) {
				car.draive();
			}
			i++;
			System.out.println(cars);
		}
		System.out.println("***********");
		System.out.println(cars);
	}

}
