package org.hassan.morsecodedecode.mapping;

import java.util.HashMap;

public class MorseTextMapping {
	
	private static HashMap<Character, String> charToMorse= new HashMap<Character, String>();
	private static HashMap<String, String> morseToChar= new HashMap<String, String>();
	
	//Constructor : Also initializes maps with values
	public MorseTextMapping(){
		mapIntializer();
	}
		
	//Saving key Value pairs of Morse code
	private static void mapIntializer(){

		charToMorse.put('a', ".-");
		charToMorse.put('b', "-...");
		charToMorse.put('c', "-.-.");
		charToMorse.put('d', "-..");
		charToMorse.put('e', ".");
		charToMorse.put('f', "..-.");
		charToMorse.put('g', "--.");
		charToMorse.put('h', "....");
		charToMorse.put('i', "..");
		charToMorse.put('j', ".---");
		charToMorse.put('k', "-.-");
		charToMorse.put('l', ".-..");
		charToMorse.put('m', "--");
		charToMorse.put('n', "-.");
		charToMorse.put('o', "---");
		charToMorse.put('p', ".--.");
		charToMorse.put('q', "--.-");
		charToMorse.put('r', ".-.");
		charToMorse.put('s', "...");
		charToMorse.put('t', "-");
		charToMorse.put('u', "..-");
		charToMorse.put('v', "...-");
		charToMorse.put('w', ".--");
		charToMorse.put('x', "-..-");
		charToMorse.put('y', "-.--");
		charToMorse.put('z', "--..");
		charToMorse.put('0',"-----" );
		charToMorse.put('1',".----" );
		charToMorse.put('2',"..---");
		charToMorse.put('3',"...--" );
		charToMorse.put('4',"....-" );
		charToMorse.put('5',"....." );
		charToMorse.put('6',"-...." );
		charToMorse.put('7',"--..." );
		charToMorse.put('8',"---.." );
		charToMorse.put('9',"----." );
		charToMorse.put('.',".-.-" );
		charToMorse.put(',',"--..--" );
		charToMorse.put('?',"..--.." );
		charToMorse.put(' ',"|" );
		
		morseToChar.put(".-", "a" );
		morseToChar.put("-..." ,"b" );
		morseToChar.put("-.-.", "c" );
		morseToChar.put("-.." , "d");
		morseToChar.put("." , "e" );
		morseToChar.put("..-." , "f");
		morseToChar.put("--." , "g" );
		morseToChar.put("...." , "h");
		morseToChar.put(".." , "i" );
		morseToChar.put(".---" ,"j");
		morseToChar.put("-.-" ,"k");
		morseToChar.put(".-.." , "l");
		morseToChar.put("--" , "m" );
		morseToChar.put( "-.", "n");
		morseToChar.put("---", "o");
		morseToChar.put(".--." , "p");
		morseToChar.put("--.-" , "q");
		morseToChar.put(".-." , "r");
		morseToChar.put("..." ,"s");
		morseToChar.put("-", "t" );
		morseToChar.put("..-" , "u");
		morseToChar.put("...-" , "v");
		morseToChar.put(".--" , "w" );
		morseToChar.put("-..-", "x");
		morseToChar.put("-.--" , "y");
		morseToChar.put("--.." , "z");
		morseToChar.put("-----" , "0" );
		morseToChar.put(".----" , "1" );
		morseToChar.put("..---" , "2");
		morseToChar.put("...--", "3" );
		morseToChar.put("....-" , "4" );
		morseToChar.put(".....", "5");
		morseToChar.put("-...." ,"6" );
		morseToChar.put("--...", "7" );
		morseToChar.put("---..", "8" );
		morseToChar.put("----.", "9" );
		morseToChar.put(".-.-" , "." );
		morseToChar.put("--..--"  , ",");
		morseToChar.put("..--.." , "?" );
		morseToChar.put(" "," " );
		
	
	}

	public HashMap<Character, String> getCharToMorseMap() {
		return charToMorse;
	}

	public HashMap<String, String> getMorseToCharMap() {
		return morseToChar;
	}
	
	
	
}

