package packageName;
import java.util.Scanner;

public class file3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		int num1 = scanner.nextInt();
		
		System.out.print("");
		int num2 = scanner.nextInt();
		
		System.out.print("");
		int num3 = scanner.nextInt();
		
		scanner.close();
		
		int total = num1 + num2 + num3;
		int avg = total / 3;
		int stars = total % 5;
		
		System.out.println("Total Score: " + total);
		System.out.println("Average Score: " + avg);
		System.out.println("Stars Earned: " + stars);
	}

}
