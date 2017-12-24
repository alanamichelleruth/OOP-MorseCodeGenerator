package edu.albany.hw2.morse;
import java.util.Scanner;

//Class to test the MorseGenerator class
public class MorseGeneratorTest {
	public static void main(String[] args){
		MorseGenerator line;
		
		//If user input a command line argument, use that
		if(args.length > 0){
			//Initialize MorseGenerator with command line argument
			line = new MorseGenerator(args[0]);
			
			System.out.println("Your string: \n" + line.getLine());
		}
		//Otherwise, ask for a String
		else{
			//Scanner to read in user input
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter a string:");
			//Initialize MorseGenerator with user input
			line = new MorseGenerator(scan.nextLine());
			
			//Close the Scanner
			scan.close();
		}
		
		//Test the getMorse method and print
		System.out.println("Your string in Morse Code:");
		System.out.println(line.getMorse());
	}
}

/*EXPLAIN: What strategy you used to store the morse code encoding table and WHY? 
(-10points if this is missing). Can add it as comment on the class.
	I decided to use a HashMap to store my Morse Code encoding table.
	I believed it made the most sense to have each English character as a key paired to it's morse code value.
	Also, a HashMap has a searching time of O(1), whereas if I were to have used an array the search time is O(n).
	A HashMap is the most efficient and, in my opinion, the easiest to use.*/

