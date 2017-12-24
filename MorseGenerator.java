package edu.albany.hw2.morse;
import java.util.HashMap;

//Class MorseCodeGenerator generates Morse Dode for a given string input
public class MorseGenerator {
	
	//Constant array variables to hold English characters and their Morse Code equivalences
	private static final char[] ENGLISH = {' ', ',', '.', '?', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	private static final String[] MORSE_CODE = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
	//Constant HashMap to hold the English Character "key" to its respective Morse Code String "value"
	private static final HashMap<Character, String> MORSE_CODE_MAP = createHashMap();
	//Initialize static HashMap
	private static HashMap<Character, String> createHashMap(){
		HashMap<Character, String> MORSE_CODE_MAP = new HashMap<Character, String>();
		
		//Loops through the char array and initializes all key:value (English:Morse) pairs
		for (int i = 0; i < ENGLISH.length; i++)
			MORSE_CODE_MAP.put(Character.valueOf(ENGLISH[i]), MORSE_CODE[i]);
		
		return MORSE_CODE_MAP;
	}
	
	//Private String for the user input
	private String line;
	
	//Constructor to instantiate a MorseGenerator with a String
	public MorseGenerator(String line){
		this.line = line;
	}
		
	//Finds and returns the String's Morse Code as a StringBuffer
	public StringBuffer getMorse(){
		StringBuffer morse = new StringBuffer();
		//Make line uppercase (because char array English is all uppercase)
		String lineUpper = line.toString().toUpperCase();
		Character c;
		
		//Loops through the line character by character and appends the Morse Code followed by a space at each iteration
		for(int i = 0; i < lineUpper.length(); i++){
			c = Character.valueOf(lineUpper.charAt(i));
			morse.append(MORSE_CODE_MAP.get(c) + " ");
		}
		return morse;
	}
	
	public String getLine(){
		return line;
	}
}