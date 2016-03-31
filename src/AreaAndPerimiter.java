import java.util.Scanner;

public class AreaAndPerimiter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		float length;
		length = 0;
		float width;
		width = 0;
		float height;
		width = 0;
		float area;
		float perimeter;
		float volume;
		do {

			System.out.println("Welcome to the Grand Circus room detail generator! ");
			System.out.println("Enter the length of the room: ");
			length = scan.nextFloat();
			System.out.println("Enter the width of the room: ");
			width = scan.nextFloat();
			System.out.println("Enter the height of the room: ");
			height = scan.nextFloat();
			area = (length * width);
			perimeter = ((length + width) * 2);
			volume = (length * width * height);
			System.out.println("The area of the room is: " + area);
			System.out.println("The perimeter of the room is: " + perimeter);
			System.out.println("The volume of the room is: " + volume);
			System.out.println("Would you like to continue: (y/n)?");
			input = scan.next();
		}

		while (input.equals("y"));
		scan.close();
	}

}
