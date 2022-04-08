package aula05.exer3;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		if (validateWidth(width)) this.width = width;
		if (validateHeight(height)) this.height = height;
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	public void setWidth(double width) {
		if (validateWidth(width)) this.width = width;
	}

	public void setHeight(double height) {
		if (validateHeight(height)) this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Rectangle rectangle = (Rectangle) obj;
		return this.width == rectangle.width && this.height == rectangle.height;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}

	@Override
	public String toString() {
		return "Rectangle with width " + this.width + " and height " + this.height;
	}

	private boolean validateWidth(double width) {
		if (width <= 0) throw new IllegalArgumentException("Width cannot be negative.");
		return true;
	}

	private boolean validateHeight(double height) {
		if (height <= 0) throw new IllegalArgumentException("Height cannot be negative.");
		return true;
	}
}
