package lab2;
import java.util.Scanner;
public class CirclePyramid {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your choice, Circle(Enter 1) or Pyramid(Enter 2):");
		int choice = scnr.nextInt();
		double radius;
		double length;
		double width;
		double height;
		
		if (choice == 1) {
			System.out.println("Enter the radius of the cirlce:");
			radius = scnr.nextDouble();
			Calculate_circle(radius);
			
		}else if(choice == 2) {
			System.out.println("Enter the length, width and height of the pyramid:");
			length = scnr.nextDouble();
			width = scnr.nextDouble();
			height = scnr.nextDouble();
			Calculate_pyramid(length, width, height);
		}
		else {
			System.out.println("Invalid choice! Enter 1 for circle & 2 for pyramid.");
		}
	}
		
	public static void Calculate_circle(double radius) {
			double area = Math.PI * Math.pow(radius, 2);
			double circumference = 2 * Math.PI * radius;
			System.out.println("Area = " + area);
			System.out.println("Circumference = " + circumference);
		}
		
		public static void Calculate_pyramid(double length, double width, double height) {
			double baseArea = length * width;
			double volume = (length * width * height)/3;
			System.out.println("Base Area = " + baseArea);
			System.out.println("Volume = " + volume);
		}


}
