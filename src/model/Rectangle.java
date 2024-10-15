package model;

public class Rectangle extends Calculator{
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	protected String calculator() {
		Double area = 0.0;
		area = getWidth() * getHeight();

		return String.format("Retângulo l: %.2f a: %.2f = %.2f", getWidth(), getHeight(), area);
	}
}
