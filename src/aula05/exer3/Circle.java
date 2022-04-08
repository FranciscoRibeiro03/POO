package aula05.exer3;

public class Circle {
	private double radius;

	public Circle(double radius) {
		if (validateRadius(radius)) this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		if (validateRadius(radius)) this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Circle circle = (Circle) obj;
		return this.radius == circle.radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle with radius " + this.radius;
	}

	private boolean validateRadius(double radius) {
		if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative.");
		return true;
	}
}
