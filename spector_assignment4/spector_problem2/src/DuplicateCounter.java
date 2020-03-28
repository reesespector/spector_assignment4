import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class DuplicateCounter {
	
	public String wordCounter = " ";
		
		public static void main(String[] dataFile) {
			String input = " ";
			int i = 0;
			
			try {
				Scanner inputText = new Scanner(new File("problem2.txt"));
				FileWriter output = new FileWriter("unique_words.txt");

				// using a set which removes duplicates inherently
				Set HashSet = new HashSet();

				// scan through the lines
				while (inputText.hasNextLine()) {
					input = inputText.nextLine();

					// write non duplicates
					if (HashSet.add(input)) {
						i++;
						output.write(1);
						output.append(input + "\n");
					}
				}
			    System.out.println("DuplicateCounter - Done!");

				// close input & output
				inputText.close();
				output.close();

			} catch (IOException ex) {
				System.out.println("Error, File not Found");
			}
	}
}




