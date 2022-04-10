/*
 Naveen Reddy
 C0838989
 Question-14
 2022-01-05
 */

package q14;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// class 
public class Q14 {

	public static void main(String[] args) {

		String Words_files = "C:\\Users\\Naveen Reddy\\eclipse-workspace\\Assignment-1\\src\\q14\\words.txt";

		try (Scanner f_scanner = new Scanner(new FileInputStream(Words_files))) {
			String targetWord = null; // word with most consecutive vowels
			// variable to store consecutive vowels
			int Maximum_consecutive_vowels = 0;

			while (f_scanner.hasNext()) {
				// for each word in the file
				String word = f_scanner.next().toLowerCase();
				int consecutiveVowels = 0;
				// for loop to check vowels in the words

				for (int i = 0; i < word.length()
						&& i < word.length() - Maximum_consecutive_vowels + consecutiveVowels; i++) {
					// check the each character in the word and exits if its not having consecutive
					// vowels
					if (vowels_in_wordfile(word.charAt(i))) {
						// incrementing consecutive vowels for incrementing
						consecutiveVowels++;

					} else {
						// reached the end of the vowels so check if we beat Maximum_consecutive_vowels
						if (consecutiveVowels > Maximum_consecutive_vowels) {
							Maximum_consecutive_vowels = consecutiveVowels;

							targetWord = word;
						}
						consecutiveVowels = 0;
					}
				}
				// reached the end of the vowels at the end of the word so check if we beat
				// Maximum_consecutive_vowels
				if (consecutiveVowels > Maximum_consecutive_vowels) {
					// assigning the values of consecutive vowels to max_consicutive
					Maximum_consecutive_vowels = consecutiveVowels;
					targetWord = word;
				}
			}
			// if block to raise error message if no words having vowels
			if (targetWord == null) {
				System.out.println("there are no word in the file  with vowels in words file: " + Words_files);
			}
			// if it found any word that having vowels it enters into the condition
			else {
				System.out.println(
						"************************************************************************************ ");
				System.out.println("the word with the most consecutive vowels is '" + targetWord.toUpperCase()
						+ "' in the word's file");
				System.out.println("it has " + Maximum_consecutive_vowels + " consecutive vowels");
				System.out.println(
						"************************************************************************************ ");
			}

		} // exception handling here if file not found in the path
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// boolean type method to check if vowel is in the word or not
	private static boolean vowels_in_wordfile(char c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}
		return false;
	}
}
