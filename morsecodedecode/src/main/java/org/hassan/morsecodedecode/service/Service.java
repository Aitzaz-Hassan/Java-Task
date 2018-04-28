package org.hassan.morsecodedecode.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.hassan.morsecodedecode.mapping.MorseTextMapping;

public class Service {
	MorseTextMapping mapping = new MorseTextMapping();
	HashMap<Character, String> charToMorseMap = mapping.getCharToMorseMap();
	HashMap<String, String> morseToCharMap = mapping.getMorseToCharMap();

	/**
	 * Reads morseCode from input file and writes Alphabets to output file
	 * 
	 * @param inputStream
	 * @param outputStream
	 */
	public void morseToText(FileReader inputStream, FileWriter outputStream) {
		int c;
		char ch;
		try {
			String code = "";
			while ((c = inputStream.read()) != -1) {
				ch = (char) c;
				if (ch != ' ' && ch != '|') {
					code = code + ch;
				} else if (ch == ' ' && code != "") {
					outputStream.write(new Service().decodeChar(code)
							.toUpperCase());
					code = "";
				} else if (ch == '|') {
					outputStream.write(' ');
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads text from the input file and writes Morse code to output file
	 * 
	 * @param inputStream
	 * @param outputStream
	 */
	public void textToMorse(FileReader inputStream, FileWriter outputStream) {
		int c;
		char ch;
		try {
			while ((c = inputStream.read()) != -1) {
				ch = (char) c;
				ch = Character.toLowerCase(ch);
				outputStream.write(new Service().encodeChar(ch));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param ch
	 * @return MorseCode
	 * @throws Exception
	 */
	public String encodeChar(Character ch) throws Exception {
		if (charToMorseMap.get(ch) == null) {
			throw new Exception(
					"MorseCode not found : Input File contains invalid chars");
		} else
			return charToMorseMap.get(ch);

	}

	/**
	 * 
	 * @param chCode
	 * @return Char
	 * @throws Exception
	 */
	public String decodeChar(String chCode) throws Exception {
		if (morseToCharMap.get(chCode) == null) {
			throw new Exception(
					"Char not found : Input File contains invalid MorseCode");
		} else
			return morseToCharMap.get(chCode);
	}

}
