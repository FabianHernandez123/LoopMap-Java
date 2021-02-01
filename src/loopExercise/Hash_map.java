package loopExercise;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_map {

	public static void main(String[] args) {
		HashMap<String, String> cars = new HashMap<>(); 
		Scanner userInput = new Scanner(System.in);
		cars.put("Sante Fe", "Hyundai");
		cars.put("Camry", "Toyota");
		cars.put("Stelvio", "Alfa Romeo");
		cars.put("Model S", "Tesla");
		cars.put("Ghibli", "Maserati");
		System.out.println("What model are you looking for? ");
		String carModel = userInput.nextLine();
		for (String key : cars.keySet()) {
			if (carModel.equalsIgnoreCase(key)) {
				System.out.printf("We do have the %s %s in stock right now! Can you follow me.", key, cars.get(key));
				userInput.close();
				System.exit(0);
			}
		}
		System.out.printf("We don't have that right now, but you can check in later. Thank you!");
		
		

	}

}
