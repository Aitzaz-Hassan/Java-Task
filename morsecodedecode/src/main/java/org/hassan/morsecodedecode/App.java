package org.hassan.morsecodedecode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.hassan.morsecodedecode.service.Service;

public class App {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		FileReader inputStream = null;
		FileWriter outputStream = null;
		System.out.println("Please Enter your choice ( 1 or 2)");
		System.out.println(" 1- English to Morse code converstion");
		System.out.println(" 2- Morse code to English converstion");
		int choice = in.nextInt();
		System.out.println("Enter input file path");
		String inPath = in.next();
		System.out.println("Enter output file path");
		String outPath = in.next();

		try {
			inputStream = new FileReader(inPath);
			outputStream = new FileWriter(outPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		Service service = new Service();
		switch (choice) {

		case 1: {// Text to Morse Encoding
			service.textToMorse(inputStream, outputStream);
			System.out.println("Encoding Complete : output file saved - "
					+ outPath);
			break;
		}
		case 2: {// Morse to Text Decoding
			service.morseToText(inputStream, outputStream);
			System.out.println("Decoding Complete : output file saved - "
					+ outPath);
			break;
		}
		default: {
			in.close();
			throw new Exception(" Wrong Input: should be either 1 or 2");
		}

		}

		// close Streams
		try {
			inputStream.close();
			outputStream.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}