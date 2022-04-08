package aula05.exer3;

import java.util.Scanner;
import aula05.Util;

public class Exer3 {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle(1);
		Rectangle rectangle = new Rectangle(1, 1);
		Triangle triangle = new Triangle(1, 1, 1);

		do {
			System.out.println("Geometric shapes operations:");
			System.out.println("1 - create new Circle");
			System.out.println("2 - create new Rectangle");
			System.out.println("3 - create new Triangle");
			System.out.println("4 - show current Circle");
			System.out.println("5 - show current Rectangle");
			System.out.println("6 - show current Triangle");
			System.out.println("7 - change Circle radius");
			System.out.println("8 - change Rectangle width and height");
			System.out.println("9 - change Triangle side1, side2 and side3");
			System.out.println("10 - show Circle area");
			System.out.println("11 - show Rectangle area");
			System.out.println("12 - show Triangle area");
			System.out.println("13 - show Circle perimeter");
			System.out.println("14 - show Rectangle perimeter");
			System.out.println("15 - show Triangle perimeter");
			System.out.println("0 - exit");

			input = Util.getInt("Escolha uma operação: ", sc, 0, 15);

			switch (input) {
				case 1:
					double radius = Util.getDouble("Introduza o raio: ", sc);
					circle = new Circle(radius);
					System.out.println("Circle criado: " + circle);
					break;

				case 2:
					double width = Util.getDouble("Introduza o comprimento: ", sc);
					double height = Util.getDouble("Introduza a altura: ", sc);
					rectangle = new Rectangle(width, height);
					System.out.println("Rectangle criado: " + rectangle);
					break;

				case 3:
					double side1 = Util.getDouble("Introduza o lado 1: ", sc);
					double side2 = Util.getDouble("Introduza o lado 2: ", sc);
					double side3 = Util.getDouble("Introduza o lado 3: ", sc);
					triangle = new Triangle(side1, side2, side3);
					System.out.println("Triangle criado: " + triangle);
					break;

				case 4:
					System.out.println("Circle atual: " + circle.toString());
					break;

				case 5:
					System.out.println("Rectangle atual: " + rectangle.toString());
					break;

				case 6:
					System.out.println("Triangle atual: " + triangle.toString());
					break;

				case 7:
					double radius2 = Util.getDouble("Introduza o raio: ", sc);
					circle.setRadius(radius2);
					System.out.println("Circle atual: " + circle.toString());
					break;

				case 8:
					double width2 = Util.getDouble("Introduza o comprimento: ", sc);
					double height2 = Util.getDouble("Introduza a altura: ", sc);
					rectangle.setWidth(width2);
					rectangle.setHeight(height2);
					System.out.println("Rectangle atual: " + rectangle.toString());
					break;

				case 9:
					double side11 = Util.getDouble("Introduza o lado 1: ", sc);
					double side22 = Util.getDouble("Introduza o lado 2: ", sc);
					double side33 = Util.getDouble("Introduza o lado 3: ", sc);
					triangle.setSides(side11, side22, side33);
					System.out.println("Triangle atual: " + triangle.toString());
					break;

				case 10:
					System.out.println("Circle area: " + circle.getArea());
					break;

				case 11:
					System.out.println("Rectangle area: " + rectangle.getArea());
					break;

				case 12:
					System.out.println("Triangle area: " + triangle.getArea());
					break;

				case 13:
					System.out.println("Circle perimeter: " + circle.getPerimeter());
					break;

				case 14:
					System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
					break;

				case 15:
					System.out.println("Triangle perimeter: " + triangle.getPerimeter());
					break;

				case 0:
					break;
			}
		} while (input != 0);
	}
}
