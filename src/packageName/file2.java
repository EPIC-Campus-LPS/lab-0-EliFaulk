package packageName;
import java.util.Scanner;

public class file2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your birth year: ");
		int birthYear = scanner.nextInt();
		int year = birthYear + 100;
		
		System.out.println("You will turn 100 in " + year);
		
		scanner.close();
	}

}
