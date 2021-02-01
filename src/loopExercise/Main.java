package loopExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		int sumNum = 0; 
		int prodNum = 1; 
		for (int i=0; i<5; i++) {
			System.out.println("Enter a number: ");
			int thisNum = userInput.nextInt(); 
			numbers.add(thisNum);
			sumNum += thisNum;
			prodNum *= thisNum; 
			
		}
		int maxNum = Collections.max(numbers);
		int minNum = Collections.min(numbers);
		System.out.printf("Sum: %d, Product: %d, Maximum: %d, Minimum: %d", sumNum, prodNum, maxNum, minNum);
			
		userInput.close();	
		

	}
	

}
