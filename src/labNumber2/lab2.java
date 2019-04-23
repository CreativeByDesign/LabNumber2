package labNumber2;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the wideth of the room: ");
		double wideth = scan.nextDouble();

		while (wideth > 0) {

			System.out.println("Please enter the length of the room: ");
			double length = scan.nextDouble();

			System.out.println("wideth: " + wideth);

			System.out.println("length: " + length);

			System.out.println("The area of the room is " + (wideth * length));

			double perimeter = 2 * (wideth + length);
			System.out.println("The perimeter of the room is " + perimeter);

			System.out.println("Please enter the wideth of the next room: ");
			wideth = scan.nextInt();

		}

		System.out.println("Goodbye!");
		scan.nextLine();

	}

}
