package aula05.exer3;

public class Circle {
	private double radius;

	public Circle(double radius) {
		if (validateRadius(radius))
			this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		if (validateRadius(radius))
			this.radius = radius;
	}

	public boolean equals(Object obj) {
		if (getClass() != obj.getClass()) return false;
		Circle circ = (Circle) obj;
		return this.radius == circ.getRadius();
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "Circle with radius " + this.radius;
	}

	private boolean validateRadius(double radius) {
		if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative.");
		return true;
	}
}
