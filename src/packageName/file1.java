package packageName;
import java.util.Scanner;

public class file1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Verb: ");
		String verb = scanner.nextLine();
		
		System.out.print("Adjective: ");
		String adjective = scanner.nextLine();
		
		System.out.print("Noun: ");
		String noun = scanner.nextLine();
		
		System.out.println("They wanted to " + verb + " a " + adjective + " " + noun + " for the science fair.");
		
		scanner.close();
	}

}
