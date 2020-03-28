// Reese Spector 3958708

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

	public String uniqueWords;

	public static void main(String[] dataFile) {
		String input = " ";

		try {
			Scanner inputText = new Scanner(new File("problem1.txt"));
			FileWriter output = new FileWriter("unique_words.txt");

			// using a set which removes duplicates inherently
			Set HashSet = new HashSet();

			// scan through the lines
			while (inputText.hasNextLine()) {
				input = inputText.nextLine();

				// write non duplicates
				if (HashSet.add(input)) {
					output.append(input + "\n");
				}
			}
		    System.out.println("Duplicate Remover - Done!");

			// close input & output
			inputText.close();
			output.close();

		} catch (IOException ex) {
			System.out.println("Error, File not Found");
		}
	}
}
